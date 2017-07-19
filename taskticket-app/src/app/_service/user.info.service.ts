import {Injectable} from "@angular/core";
import {IUser} from "../_model/user";

@Injectable()
export class UserInfoService {

  constructor() {
  }

  public setUserInfo(user: IUser): void {
    localStorage.setItem('user', JSON.stringify(user));
  }

  public getUserInfo(): IUser {
    return JSON.parse(localStorage.getItem('user')) as IUser;
  }

  public removeUserInfo(): void {
    localStorage.removeItem('user');
  }

  public existsUserInfo(): boolean {
    return localStorage.getItem('user') != null;
  }
}
