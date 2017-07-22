import {Component, OnInit, Input} from '@angular/core';
import {ProjectService} from "../../_service/project.service";
import {IProjectList, IProject} from "../../_model/project";
import {AuthService} from "../../_service/auth.service";

@Component({
  moduleId: module.id,
  selector: 'layout-header',
  templateUrl: 'header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  // ===================================================================================
  //                                                                           Attribute
  //                                                                           =========
  @Input() currentProjectId: number;
  projectList: Array<IProject>;

  // ===================================================================================
  //                                                                         Constructor
  //                                                                         ===========
  constructor(private projectService: ProjectService, private authService: AuthService) {
  }

  ngOnInit() {
    this.projectService.getProjectList().then(res => {
      this.projectList = (res.json() as IProjectList).projectList;
    });
  }

  public getProjectUrl(project: IProject): string {
    return '/project/' + project.projectId;
  }

  public logout(): void {
    this.authService.logout();
  }
}
