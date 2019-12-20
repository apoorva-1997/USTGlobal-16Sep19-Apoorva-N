import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  imgUrl = 'https://image.shutterstock.com/image-photo/boxes-trolley-on-laptop-keyboard-260nw-580499569.jpg';
  constructor() { }

  ngOnInit() {
  }

}
