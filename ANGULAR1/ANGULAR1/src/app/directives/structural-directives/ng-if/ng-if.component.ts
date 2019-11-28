import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-if',
  templateUrl: './ng-if.component.html',
  styleUrls: ['./ng-if.component.css']
})
export class NgIfComponent implements OnInit {
  showorhide:boolean = false;
  constructor() {
  setTimeout(() => {
    this.showorhide = true;
  },200);
   }

  ngOnInit() {

  }

}
