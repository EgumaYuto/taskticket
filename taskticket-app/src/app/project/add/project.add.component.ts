///<reference path="../../../../node_modules/rxjs/add/operator/toPromise.d.ts"/>
import { Component, OnInit } from '@angular/core';
import { Http, Headers } from "@angular/http";
import { UserInfoService } from "../../_service/user.info";
import {validateProjectName} from "@angular/cli/utilities/validate-project-name";

@Component({
  selector: 'project-add',
  templateUrl: 'project.add.component.html',
  styleUrls: ['./project.add.component.css']
})
export class ProjectAddComponent implements OnInit {

  // ===================================================================================
  //                                                                          Definition
  //                                                                          ==========
  private static _projectUrl = 'http://localhost:9001/project';

  // ===================================================================================
  //                                                                           Attribute
  //                                                                           =========
  projectName: string;
  projectDetail: string;
  projectNameList: Array<string>;

  // ===================================================================================
  //                                                                         Constructor
  //                                                                         ===========
  constructor(private http: Http, private userInfoService: UserInfoService) {}

  ngOnInit() {
    this.getProjectList();
  }

  private getProjectList(): void {
    let headers = new Headers({
      'Content-Type': 'application/json',
      'Authorization' : this.userInfoService.getUserInfo().accessToken
    });
    this.http.get(ProjectAddComponent._projectUrl, {headers: headers}).toPromise()
      .then(res => {
        this.projectNameList = res.json().projectList.map(project => {
          return project.projectName;
        });
      }).catch(res => console.log(res));
  }

  public addProject(): void {
    let headers = new Headers({
      'Content-Type': 'application/json',
      'Authorization' : this.userInfoService.getUserInfo().accessToken
    });
    let body = JSON.stringify({
      projectName: this.projectName,
      projectDetail: this.projectDetail
    });
    this.http.post(ProjectAddComponent._projectUrl, body, {headers: headers}).toPromise()
      .then(res => {})
      .catch(res => console.log(res));
  }
}
