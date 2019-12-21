import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from './../../user.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-changepassword',
  templateUrl: './changepassword.component.html',
  styleUrls: ['./changepassword.component.css']
})
export class ChangepasswordComponent implements OnInit {

  constructor(private service: UserService, private router: Router) { }

  change(form: NgForm) {
    this.service.changePassword(form.value).subscribe( res => {
      console.log('Respponse of changepassword', res);
      if (res !== 0) {
        alert('password changed successfully');
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
