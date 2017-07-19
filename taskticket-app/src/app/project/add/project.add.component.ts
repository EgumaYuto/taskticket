///<reference path="../../../../node_modules/rxjs/add/operator/toPromise.d.ts"/>
import { Component, OnInit } from '@angular/core';
import { Http, Headers } from "@angular/http";
import { UserInfoService } from "../../_service/user.info.service";
import {IProject, IProjectList} from "../../_model/project";
import {ProjectService} from "../../_service/project.service";

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
  projectList: Array<IProject>;

  // ===================================================================================
  //                                                                         Constructor
  //                                                                         ===========
  constructor(private http: Http, private userInfoService: UserInfoService, private projectSerivce: ProjectService) { }

  ngOnInit() {
    this.getProjectList();
  }

  private getProjectList(): void {
    this.projectSerivce.getProjectList().then(res => {
        this.projectList = (res.json() as IProjectList).projectList;
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
      .then(res => {
        console.log(res);
        let project = res.json() as IProject;
        console.log(project);
        window.location.href = '/project/' + project.projectId;
      }).catch(res => console.log(res));
  }

  public getProjectUrl(project: IProject) {
    return '/project/' + project.projectId;
  }
}
