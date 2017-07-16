import {Component, OnInit} from '@angular/core';
import {AuthService} from "../_service/auth.service";
import {UserInfoService} from "../_service/user.info";
import {IUser} from "../_model/user.model";
import {IValidationErrorModel} from "../_model/error.validation.model";

@Component({
  selector: 'signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  // ===================================================================================
  //                                                                          Definition
  //                                                                          ==========
  private static _redirectUrl: string = '/';
  private static _invalidInputClass: string = 'invalid';

  // ===================================================================================
  //                                                                           Attribute
  //                                                                           =========
  // ----------------------------------
  //                           Password
  //                           --------
  name: string;
  nameErrorMessage: string;
  nameInputClasses: Array<string>;

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
    this.nameInputClasses =  Array('validate');
  }

  // ===================================================================================
  //                                                                               Login
  //                                                                               =====
  signup(): void {
    this.authService.signup(this.name, this.email, this.password)
      .then(res => {
        this.accessTokenService.setUserInfo(res.json() as IUser);
        this.redirectMypage();
      }).catch(res => {
      this.handleErrorResponse(res);
    });
  }

  private redirectMypage() {
    window.location.href = SignupComponent._redirectUrl;
  }

  private handleErrorResponse(res) {
    if (res.status === 400) {
      let errorModel = res.json() as IValidationErrorModel;
      errorModel.errors.forEach(error => {
        if (error.field === 'name') {
          error.messages.forEach(message => {
            this.nameErrorMessage = message;
          });
          this.nameInputClasses.push(SignupComponent._invalidInputClass);
        }

        if (error.field === 'email') {
          error.messages.forEach(message => {
            this.emailErrorMessage = message;
          });
          this.emailInputClasses.push(SignupComponent._invalidInputClass);
        }

        if (error.field === 'password') {
          error.messages.forEach(message => {
            this.passwordErrorMessage = message;
          });
          this.passwordInputClasses.push(SignupComponent._invalidInputClass);
        }
      });
    }
  }
}
