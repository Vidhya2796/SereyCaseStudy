import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PoststrendService {

  private baseUrl = "http://localhost:6543";
  
  constructor(private http:HttpClient) { }

  getAllusers(): Observable<Object>{
    return this.http.get(`${this.baseUrl}` + `/getAllPosts`);
  }

  updateLike(userName:string,likes:number): Observable<Object>{
    console.log(`${this.baseUrl}` + `/updateLikes/`+userName+`/`+likes)
    return this.http.get(`${this.baseUrl}` + `/updateLikes/`+userName+`/`+likes);
  }
  
  }
