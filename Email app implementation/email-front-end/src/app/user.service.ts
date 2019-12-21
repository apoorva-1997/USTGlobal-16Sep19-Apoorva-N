import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';


@Injectable({
    providedIn: 'root'
})

export class UserService {

    constructor(private http: HttpClient) {}

    composeEmail(email): Observable<any> {
       return this.http.post('http://localhost:8080/compose', email);
    }

    changePassword(password): Observable<any> {
        return this.http.post('http://localhost:8080/change', password);
    }

    deleteEmail(mid): Observable<any> {
        return this.http.delete(`http://localhost:8080/deleteMail=?${mid}`);
    }
    getEmail(): Observable<any> {
        return this.http.get<any>('http://localhost:8080/inbox');
    }
    draft(email): Observable<any> {
        return this.http.post('http://localhost:8080/register', email);
    }
}
