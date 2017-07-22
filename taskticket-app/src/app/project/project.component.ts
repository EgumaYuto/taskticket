///<reference path="../../../node_modules/rxjs/add/operator/map.d.ts"/>
import {Component, OnInit, Input} from '@angular/core';
import {IProject, IProjectList} from "../_model/project";
import {ActivatedRoute} from "@angular/router";
import {ProjectService} from "../_service/project.service";

@Component({
  moduleId: module.id,
  selector: 'project',
  templateUrl: 'project.component.html',
  styleUrls: ['./project.component.css']
})
export class ProjectComponent implements OnInit {

  // ===================================================================================
  //                                                                           Attribute
  //                                                                           =========
  @Input() project: IProject;

  // ===================================================================================
  //                                                                         Constructor
  //                                                                         ===========
  constructor(private projectService: ProjectService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.route.params.subscribe(p => {
      let id: Number = +p['id'];
      this.projectService.getProject(id).then(res => {
        this.project = res.json() as IProject;
      });
    });
  }
}
