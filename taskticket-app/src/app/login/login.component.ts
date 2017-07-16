import {Component, OnInit} from '@angular/core';
import {AuthService} from "../_service/auth.service";
import {UserInfoService} from "../_service/user.info";
import {IValidationErrorResp} from "../_model/error.validation";
import {IUser} from "../_model/user";

@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {

  // ===================================================================================
  //                                                                          Definition
  //                                                                          ==========
  private static _redirectUrl: string = '/';
  private static _invalidInputClass: string = 'invalid';

  // ===================================================================================
  //                                                                           Attribute
  //                                                                           =========
  // ----------------------------------
  //                              Email
  //                              -----
  email: string;
  emailErrorMessage: string;
  emailInputClasses: Array<string>;

  // ----------------------------------
  //                           Password
  //                           --------
  password: string;
  passwordErrorMessage: string;
  passwordInputClasses: Array<string>;

  // ===================================================================================
  //                                                                         Constructor
  //                                                                         ===========
  constructor(private authService: AuthService, private accessTokenService: UserInfoService) { }

  ngOnInit(): void {
    if (this.authService.isLogin()) {
      this.redirectMypage();
    }
    this.emailInputClasses = Array('validate');
    this.passwordInputClasses = Array('validate');
  }

  // ===================================================================================
  //                                                                               Login
  //                                                                               =====
  login(): void {
    this.authService.login(this.email, this.password)
      .then(res => {
        this.accessTokenService.setUserInfo(res.json() as IUser);
        this.redirectMypage();
      }).catch(res => {
        this.handleErrorResponse(res);
      });
  }

  private redirectMypage() {
    window.location.href = LoginComponent._redirectUrl;
  }

  private handleErrorResponse(res) {
    if (res.status === 400) {
      let errorModel = res.json() as IValidationErrorResp;
      errorModel.errors.forEach(error => {
        if (error.field === 'email') {
          error.messages.forEach(message => {
            this.emailErrorMessage = message;
          });
          this.emailInputClasses.push(LoginComponent._invalidInputClass);
        }

        if (error.field === 'password') {
          error.messages.forEach(message => {
            this.passwordErrorMessage = message;
          });
          this.passwordInputClasses.push(LoginComponent._invalidInputClass);
        }
      });
    }
  }
}
