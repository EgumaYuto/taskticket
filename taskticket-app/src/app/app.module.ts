import { NgModule } from '@angular/core';
import { BrowserModule } from "@angular/platform-browser";
import { FormsModule }   from '@angular/forms';
import { AppRoutingModule } from "./app-routing.module";

import { AppComponent } from './app.component';
import { LoginComponent } from "./login/login.component";
import { SignupComponent } from "./signup/signup.component";
import { MypageComponent } from "./mypage/mypage.component";

import { Http, XHRBackend, RequestOptions, HttpModule } from "@angular/http";
import { CustomHttp } from "./custom.http";
import { LoginService } from "./login/login.service";

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    MypageComponent
  ],
  imports: [
    FormsModule,
    BrowserModule,
    HttpModule,
    AppRoutingModule
  ],
  providers: [
    { provide: Http,
      useFactory: (backend:XHRBackend, defaultOptions:RequestOptions) => {
        return new CustomHttp(backend, defaultOptions)
      },
      deps: [XHRBackend, RequestOptions]
    },
    LoginService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
