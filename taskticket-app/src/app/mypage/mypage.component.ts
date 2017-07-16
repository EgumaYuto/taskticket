import {Component, OnInit} from '@angular/core';
import {AuthService} from "../_service/auth.service";

@Component({
  selector: 'mypage',
  templateUrl: './mypage.component.html'
})
export class MypageComponent implements OnInit {

  constructor(private authService: AuthService) {
  }

  ngOnInit(): void {
  }

  public logout(): void {
    this.authService.logout();
    window.location.href = '/login';
  }
}
