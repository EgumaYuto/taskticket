///<reference path="../../../node_modules/rxjs/add/operator/toPromise.d.ts"/>
import {Injectable} from "@angular/core";
import {Http, Headers} from "@angular/http";
import {UserInfoService} from "./user.info.service";

@Injectable()
export class ProjectService {

  // ===================================================================================
  //                                                                          Definition
  //                                                                          ==========
  private static _projectUrl = 'http://localhost:9001/project/';

  constructor(private http: Http, private userInfoService: UserInfoService) { }

  public getProjectList(): Promise<any> {
    let headers = new Headers({
      'Content-Type': 'application/json',
      'Authorization' : this.userInfoService.getUserInfo().accessToken
    });
    return this.http.get(ProjectService._projectUrl + 'list', {headers: headers}).toPromise();
  }

  public getProject(id: Number): Promise<any> {
    let headers = new Headers({
      'Content-Type': 'application/json',
      'Authorization' : this.userInfoService.getUserInfo().accessToken
    });
    return this.http.get(ProjectService._projectUrl + id, {headers: headers}).toPromise();
  }
}
