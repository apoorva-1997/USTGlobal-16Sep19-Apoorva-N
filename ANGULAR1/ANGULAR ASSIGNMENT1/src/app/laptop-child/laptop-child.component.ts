import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-laptop-child',
  templateUrl: './laptop-child.component.html',
  styleUrls: ['./laptop-child.component.css']
})
export class LaptopChildComponent implements OnInit {

  @Input() lap: {imgUrl: string , name: string}

  constructor() { }

  ngOnInit() {
  }

}
