import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CommentService {

  constructor(private httpClient : HttpClient) { }

  getAllComments(){
       return this.httpClient.get("http://localhost:8082/comments/all");
  }
 
}
