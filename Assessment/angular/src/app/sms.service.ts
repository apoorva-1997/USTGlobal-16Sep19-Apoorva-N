import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SmsService {

  constructor(private http: HttpClient) { }

  addproduct(user): Observable<any> {
    return this.http.post('http://localhost:8082/add', user);
  }

  searchbyn(name): Observable<any> {
    return this.http.get(`http://localhost:8082/get/${name}`, name);
  }

  searchbycompany(company): Observable<any> {
    return this.http.get(`http://localhost:8082/get/${company}`, company);
  }

  searchbycategory(category): Observable<any> {
    return this.http.get(`http://localhost:8082/get/${category}`, category);
  }
}
