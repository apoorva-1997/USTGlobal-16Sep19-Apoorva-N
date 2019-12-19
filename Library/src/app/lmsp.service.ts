import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class LmspService {
  // baseURL = 'http://localhost:8087/lmsp';
  // header = new HttpHeaders ({'content-type': 'application/json'})

  constructor(private http: HttpClient) { }

  registerUser(user): Observable<any> {
    return this.http.post('http://localhost:8087/lms/register', user);
  }

  loginUser(user): Observable<any> {
    return this.http.post('http://localhost:8087/lms/login', user);
  }

  addBook(user): Observable<any> {
    return this.http.post('http://localhost:8087/lms/add', user);
  }

  searchBook(bid): Observable<any> {
    return this.http.get(`http://localhost:8087/lms/search/${bid}`, bid);
  }

  getBook(): Observable<any> {
    return this.http.get(`http://localhost:8087/lms/get-all`);
  }

  removeBook(bid): Observable<any> {
    return this.http.delete(`http://localhost:8087/lms/delete/${bid}`);
  }

  requestBook(bid, id): Observable<any> {
    return this.http.post(`http://localhost:8087/lms/requestbook/${bid}/${id}`, bid, id);
  }

  issueBook(bid, id): Observable<any> {
    return this.http.post('http://localhost:8087/lms/issue', bid, id);
  }

  isUserLogin = false;
  isAdminLogin = false;
  home = true;

  isAdmin() {
    if (this.isAdminLogin) {
      return true;
    } else {
      return false;
    }
  }

  isUser() {
    if (this.isUserLogin) {
      return true;
    } else {
      return false;
    }
  }
}
