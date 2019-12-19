import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { LmspService } from '../lmsp.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  error: string;
  constructor(private auth: LmspService, private router: Router) {
  }

  ngOnInit() {
  }

  Loginform(form: NgForm) {
    this.error = null;
    console.log(form.value);
    this.auth.loginUser(form.value).subscribe(data => {
      console.log('Response of login', data);

      if (data && data.message === 'Login succesful') {
        localStorage.setItem('userDetails', JSON.stringify(data));

        if (data && data.adminbeans[0].role === 'admin') {
          this.auth.isAdminLogin = true;
          this.router.navigateByUrl('/');
        } else if (data && data.adminbeans[0].role === 'user') {
          this.auth.isUserLogin = true;
          this.router.navigateByUrl('/');
        } else {
          this.router.navigateByUrl('/register');
        }

      }
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });

  }



}
