import {Component, OnInit, Input} from '@angular/core';
import {ProjectService} from "../../_service/project.service";
import {IProjectList, IProject} from "../../_model/project";

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
  constructor(private projectService: ProjectService) {
  }

  ngOnInit() {
    this.projectService.getProjectList().then(res => {
      this.projectList = (res.json() as IProjectList).projectList;
    });
  }

  public getProjectUrl(project: IProject) {
    return '/project/' + project.projectId;
  }
}
