import {IErrorModel} from "./error.model";

export interface IValidationErrorModel extends IErrorModel {
  errors: Array<IValidationErrorDetailModel>;
}

export interface IValidationErrorDetailModel {
  field: string;
  messages: Array<string>;
}
