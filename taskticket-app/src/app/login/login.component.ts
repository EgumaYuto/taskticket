import {Component, OnInit} from '@angular/core';
import {LoginService} from "./login.service";

@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  email: string;
  password: string;

  constructor(private loginService: LoginService) { }

  ngOnInit(): void {
    // do noting
  }

  doLogin() {
    console.log(this.email, this.password);
    this.loginService.doLogin(this.email, this.password)
      .then(res => console.log(res))
      .catch(e => console.error(e));
  }
}
