import { NgModule }              from '@angular/core';
import { RouterModule, Routes }  from '@angular/router';
import { SignupComponent } from "./signup/signup.component";
import { LoginComponent } from "./login/login.component";
import { MypageComponent } from "./mypage/mypage.component";
import { ProjectAddComponent } from "./project/add/project.add.component";
import { AuthGuard } from "./auth.guard";

const appRoutes: Routes = [

  // allow-anyone-access
  { path: 'signup', component: SignupComponent },
  { path: 'login', component: LoginComponent },

  // login require
  { path: '', component: MypageComponent, canActivate: [AuthGuard] },
  { path: 'project/add', component: ProjectAddComponent, canActivate: [AuthGuard] },

  { path: '**', redirectTo: ''}  // TODO make 404 page
];

@NgModule({
  imports: [
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    )
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule {}
