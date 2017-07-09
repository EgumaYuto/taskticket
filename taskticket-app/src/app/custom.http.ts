///<reference path="../../node_modules/rxjs/add/operator/catch.d.ts"/>
import {Http, ConnectionBackend, RequestOptions, Request, RequestOptionsArgs, Response} from "@angular/http";
import { Observable } from "rxjs";

export class CustomHttp extends Http {

  constructor(backend:ConnectionBackend, defaultOptions:RequestOptions) {
    super(backend, defaultOptions)
  }

  request(url:string | Request, options?:RequestOptionsArgs):Observable<Response> {
    return super.request(url, options).catch((res: Response) => CustomHttp.handleResponseError(res));
  }

  get(url:string, options?:RequestOptionsArgs):Observable<Response> {
    return super.get(url, options).catch((res: Response) => CustomHttp.handleResponseError(res));
  }

  post(url:string, body:string, options?:RequestOptionsArgs):Observable<Response> {
    console.log(url, body, options);
    return super.post(url, body, options).catch((res: Response) => CustomHttp.handleResponseError(res))
  }

  put(url:string, body:string, options?:RequestOptionsArgs):Observable<Response> {
    return super.put(url, body, options).catch((res: Response) => CustomHttp.handleResponseError(res));
  }

  delete(url:string, options?:RequestOptionsArgs):Observable<Response> {
    return super.delete(url, options).catch((res: Response) => CustomHttp.handleResponseError(res));
  }

  patch(url:string, body:string, options?:RequestOptionsArgs):Observable<Response> {
    return super.patch(url, body, options).catch((res: Response) => CustomHttp.handleResponseError(res));
  }

  head(url:string, options?:RequestOptionsArgs):Observable<Response> {
    return super.head(url, options).catch((res: Response) => CustomHttp.handleResponseError(res));
  }

  private static handleResponseError(res:Response) {
    if (res.status === 401) {
      location.href = '/login'
    } else {
      console.log(res);
    }
    return Observable.throw(res);
  }
}
