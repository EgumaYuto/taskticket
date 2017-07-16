package io.github.yutoeguma.app.web.base.login;

import javax.annotation.Resource;

import io.github.yutoeguma.dbflute.exbhv.MemberAccessTokenBhv;
import io.github.yutoeguma.dbflute.exentity.MemberAccessToken;
import io.github.yutoeguma.mylasta.action.TaskticketUserBean;
import org.dbflute.optional.OptionalThing;
import org.lastaflute.di.util.UUID;

/**
 * @author yuto.eguma
 */
public class AuthInfoLogic {

    // ===================================================================================
    //                                                                       Instead Redis
    //                                                                       =============
    @Resource
    private MemberAccessTokenBhv memberAccessTokenBhv;

    // ===================================================================================
    //                                                                          Auth Logic
    //                                                                          ==========
    public String registerAccessTokenIfNeeds(Long memberId) {
        return memberAccessTokenBhv.selectByUniqueOfMemberId(memberId).map(accessToken -> {
            return accessToken.getAccessToken();
        }).orElseGet(() -> {
            String accessToken = UUID.create();
            MemberAccessToken memberAccessToken = new MemberAccessToken();
            memberAccessToken.setMemberId(memberId);
            memberAccessToken.setAccessToken(accessToken);
            memberAccessTokenBhv.insert(memberAccessToken);
            return accessToken;
        });
    }

    public OptionalThing<TaskticketUserBean> getSavedUserBean(String token) {
        return memberAccessTokenBhv.selectEntity(cb -> {
            cb.setupSelect_Member();
            cb.query().setAccessToken_Equal(token);
        }).flatMap(memberAccessToken -> {
            return memberAccessToken.getMember().map(member -> {
                return new TaskticketUserBean(member);
            });
        });
    }
}
