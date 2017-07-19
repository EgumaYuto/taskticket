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
import { UserInfoService } from "./_service/user.info.service";
import { AuthService } from "./_service/auth.service";
import { ProjectComponent } from "./project/project.component";
import { ProjectAddComponent } from "./project/add/project.add.component";
import {ProjectService} from "./_service/project.service";

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    MypageComponent,
    ProjectComponent,
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
    UserInfoService,
    ProjectService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
