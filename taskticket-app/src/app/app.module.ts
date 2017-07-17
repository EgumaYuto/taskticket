import { NgModule } from '@angular/core';
import { BrowserModule } from "@angular/platform-browser";
import { FormsModule }   from '@angular/forms';
import { HttpModule } from "@angular/http";
import { AppRoutingModule } from "./app.routing.module";
import { MaterializeModule } from 'angular2-materialize';

import { AppComponent } from './app.component';
import { LoginComponent } from "./login/login.component";
import { SignupComponent } from "./signup/signup.component";
import { MypageComponent } from "./mypage/mypage.component";

import { AuthGuard } from "./auth.guard";
import { UserInfoService } from "./_service/user.info";
import { AuthService } from "./_service/auth.service";
import { ProjectAddComponent } from "./project/add/project.add.component";

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    MypageComponent,
    ProjectAddComponent
  ],
  imports: [
    FormsModule,
    BrowserModule,
    HttpModule,
    AppRoutingModule,
    MaterializeModule
  ],
  providers: [
    AuthGuard,
    AuthService,
    UserInfoService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
