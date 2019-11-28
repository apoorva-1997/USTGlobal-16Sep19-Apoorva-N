import { Component, OnInit, DoCheck } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit, DoCheck{
  Users;
  selectedUser;
  today = new Date();

  constructor(public service: UserService) {
    this.getData();
    console.log('constructor is executed');
  }

  ngOnInit() {
    console.log('ngoninit is executed');
  }
  ngDoCheck(){
    console.log('DoCheck is execute')
  }
  loginData(form: NgForm) {
   console.log(form.value);
   this.service.postUser(form.value).subscribe(data =>{
     console.log(data);
   }, err => {
     console.log(err);
   }, () =>{
     console.log('data posted successfully')
   });
  }
  getData(){
    this.service.getUsers().subscribe(data => {
      console.log(data);
      this.Users = data;
    }, err => {
      console.log(err);
    }, () => {
      console.log('data got successfully');
    });
   }
   deleteData(user) {
     console.log(user);

     this.service.deletUser(user.id).subscribe(data => {
       console.log(data);
         this.getData();
     }, err => {
       console.log(err);
     }, () => {
       console.log('data deleted successfully');
     }
     );
    }
   selectUser(user){
     console.log(user);
     this.selectedUser = user;
   }
   UpdateData(form) {
     console.log(form.value);
     this.service.updateUser(form.value.id, form.value).subscribe(data => {
       console.log(data);
     }, err => {
       console.log(err);
     }, () => {
       console.log('data updated successfully')
     });
   }
}
