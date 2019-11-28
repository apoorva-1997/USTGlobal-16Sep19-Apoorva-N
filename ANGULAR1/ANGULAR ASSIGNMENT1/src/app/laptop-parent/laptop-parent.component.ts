import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-laptop-parent',
  templateUrl: './laptop-parent.component.html',
  styleUrls: ['./laptop-parent.component.css']
})
export class LaptopParentComponent implements OnInit {
  newlaps;
  laptops = [
    {
      name : 'Asus ROG Gaming',
      imgUrl : 'https://cdn.pixabay.com/photo/2014/09/27/13/44/notebook-463485__340.jpg',
      price : 'Rs :53000 ',
      desc : 'ASUS Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'
    },
    {
      name : 'HP Pavillion',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/07/26/17/29/mixer-861431__340.jpg',
      price : 'Rs : 40000',
      desc : 'HP Pavilion x360 With Alexa In-built. Freedom To Do More w/ Power Of Your Voice. Shop Now! Accidental Protection. Protegent Antivirus. Additional Warranty. Theft Insurance. Models: HP Pavilion x360 14, HP Gaming Pavilion - 15, OMEN by HP 15, HP Notebook - 15.'
    },
    {
      name : 'Apple Macbook air',
      imgUrl : 'https://cdn.pixabay.com/photo/2014/05/02/21/49/home-office-336373__340.jpg',
      price : 'Rs : 59999',
      desc : '2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared L3 cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory. 2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared L3 cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory.'
    },
    {
      name : 'Toshiba',
      imgUrl : 'https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/TOSHIBA_Satellite_Pro_L850/TOSHIBA_Satellite_Pro_L850_L_1.jpg',
      price : 'Rs : 45666',
      desc : 'This item 2015 Toshiba Satellite 15.6-inch Laptop- 5th Gen Intel Core i7-5500U Processor 3.0GHz, 4MB Cache, 8GB Memory, 1TB HDD, HDMI, Bluetooth, Webcam, WIFI, AMD R7 M260, Windows 8.1/Windows 10.'
    },
  ]

  constructor() { }

  ngOnInit() {
  }

  openlap(lap){
    console.log(lap);
    this.newlaps = lap;
  }

}
