/**
 * Created by yuto on 2017/07/09.
 */
import { Http, Headers } from "@angular/http";
import { Injectable } from "@angular/core";
import { Promise } from "es6-promise";

@Injectable()
export class LoginService {

  private _loginUrl = 'http://localhost:9001/login';
  private _headers = new Headers({'Content-Type': 'application/json'});

  constructor(private http: Http) { }

  public doLogin(email: string, password: string): Promise<any> {
    let body = JSON.stringify({email: email, password: password});
    return this.http.post(this._loginUrl, body, {headers: this._headers})
      .toPromise();
  }
}
