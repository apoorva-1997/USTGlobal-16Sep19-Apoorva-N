import { UserService } from './../../user.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-composeemail',
  templateUrl: './composeemail.component.html',
  styleUrls: ['./composeemail.component.css']
})
export class ComposeemailComponent implements OnInit {

  constructor(private auth: UserService, private router: Router) { }

  compose(form: NgForm) {
    this.auth.composeEmail(form.value).subscribe(response => {
      console.log('response of register', response);
      if (response !== 0) {
        alert('Email sent successfully');
        this.router.navigateByUrl('/user');
      }
      form.reset();
    }, err => {
      console.log(err);
    });
  }

  ngOnInit() {
  }

}
