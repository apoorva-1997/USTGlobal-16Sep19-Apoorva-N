import { Router } from '@angular/router';
import { UserService } from './../user.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {


  emails;
  constructor(private service: UserService, private router: Router) {
    this.showEmail();
   }

   showEmail() {
    this.service.getEmail().subscribe(res => {
      this.emails = res.email as string [];
      console.log('res', res);
      console.log(this.emails);
    });
  }
  ngOnInit() {
  }

}
