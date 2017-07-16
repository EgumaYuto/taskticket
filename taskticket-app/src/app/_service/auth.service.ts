///<reference path="../../../node_modules/rxjs/add/operator/toPromise.d.ts"/>
import { Http, Headers } from "@angular/http";
import { Injectable } from "@angular/core";
import { Promise } from "es6-promise";
import { UserInfoService } from "./user.info";
import 'rxjs/add/operator/toPromise';

@Injectable()
export class AuthService {

  private _loginUrl = 'http://localhost:9001/auth/login';
  private _headers = new Headers({
    'Content-Type': 'application/json'
  });

  constructor(private http: Http, private accessTokenService: UserInfoService) { }

  public login(email: string, password: string): Promise<any> {
    let body = JSON.stringify({email: email, password: password});
    return this.http.post(this._loginUrl, body, {headers: this._headers}).toPromise()
  }

  public isLogin(): boolean {
    return this.accessTokenService.existsUserInfo();
  }

  public logout(): void {
    this.accessTokenService.removeUserInfo();
  }
}

