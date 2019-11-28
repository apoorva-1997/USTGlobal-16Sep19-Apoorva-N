import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {

constructor() { }
 products =[
{
   img:'https://cdn.pixabay.com/photo/2019/09/14/12/40/iceland-4475920__340.jpg',
   name:'pqr',
   price:300
},
{
  img:'https://cdn.pixabay.com/photo/2019/09/28/05/10/sunset-4509879__340.jpg',
  name:'abc',
  price:400
},
{
  img:'https://cdn.pixabay.com/photo/2019/03/19/15/03/fantasy-4065924__340.jpg',
  name:'xyz',
  price:500
}];
  ngOnInit() {
  }

}
