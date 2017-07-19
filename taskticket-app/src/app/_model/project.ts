
export interface IProjectList {
  projectList: Array<IProject>;
}

export interface IProject {
  projectId: number;
  projectName: string;
  projectDetail: string;
}
