import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-car-child',
  templateUrl: './car-child.component.html',
  styleUrls: ['./car-child.component.css']
})
export class CarChildComponent implements OnInit {

  @Input() car: {imageUrl: string , name: string};

  constructor() { }

  ngOnInit() {
  }

}
