import {IErrorResp} from "./error";

export interface IValidationErrorResp extends IErrorResp {
  errors: Array<IValidationErrorDetail>;
}

export interface IValidationErrorDetail {
  field: string;
  messages: Array<string>;
}
