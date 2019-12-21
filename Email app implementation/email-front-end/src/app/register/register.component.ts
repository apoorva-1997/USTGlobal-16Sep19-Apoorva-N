import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private auth: AuthService, private router: Router) { }

  register(form: NgForm) {
    this.auth.registerUser(form.value).subscribe(response => {
      console.log('response of register', response);
      if (response !== 0) {
        alert('Registration successful');
        this.router.navigateByUrl('/login');
      }
      form.reset();
    }, err => {
      console.log(err);
    });
  }

  ngOnInit() {
  }

}
