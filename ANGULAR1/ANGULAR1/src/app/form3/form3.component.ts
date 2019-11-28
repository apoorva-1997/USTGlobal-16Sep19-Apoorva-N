import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-form3',
  templateUrl: './form3.component.html',
  styleUrls: ['./form3.component.css']
})
export class Form3Component implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  loginData(form: NgForm) {
    console.log(form);
  }

}
