import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  isLoggedIn: false;

  constructor(private http: HttpClient) { }

  registerUser(user): Observable<any> {
    return this.http.post('http://localhost:8080/register', user);
  }

  loginUser(user): Observable<any> {
    return this.http.post('http://localhost:8080/login', user);
  }

  isLLoggedIn() {
    if (this.isLoggedIn) {
      return true;
    }
    return false;
  }
}
