import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  imgUrl = 'https://cdn.pixabay.com/photo/2016/03/26/22/21/books-1281581__340.jpg';


  constructor() { }

  ngOnInit() {
  }

}
