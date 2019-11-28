import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  name = 'xyz';
  imgUrl: string = 'https://cdn.pixabay.com/photo/2019/03/19/15/03/fantasy-4065924__340.jpg';
  address: string = 'Nagarbhavi,Blore - 590016';
  colorname:string = 'red';
  isActive: boolean = false;
  colspanvalue: number = 2;
  constructor() { }

  ngOnInit() {
    setInterval( () => {
      this.colorname = 'green';
      this.isActive = !this.isActive;
    }, 2000);
  }

}
