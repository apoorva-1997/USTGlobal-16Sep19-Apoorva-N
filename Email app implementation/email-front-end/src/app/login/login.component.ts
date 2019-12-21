import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  error: string;
  constructor(private service: AuthService, private router: Router) { }

  login(form: NgForm) {
    console.log(form);
    this.service.loginUser(form.value).subscribe(response => {
      if (response != null) {
        console.log('response of login', response);
        alert('Login successful');
        this.router.navigateByUrl('/user');
      }
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }
  ngOnInit() {
  }

}
