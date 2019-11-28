import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-car-parent',
  templateUrl: './car-parent.component.html',
  styleUrls: ['./car-parent.component.css']
})
export class CarParentComponent implements OnInit {
 selectedCars;
  Cars = [
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2016/02/13/13/11/cuba-1197800__340.jpg',
      name : 'Maruthi',
      model:'Model : 1945',
      // tslint:disable-next-line: max-line-length
      desc:'The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.'
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
      name : 'BMW',
      model:'Model : 2010',
      // tslint:disable-next-line: max-line-length
      desc:'BMW cars price starts at Rs. 35.20 lakh for the cheapest car X1 and goes up to Rs. 2.43 crore for the top model BMW 7 Series. BMW offers 14 new car models in India. X1 (Rs. 35.20 lakh), Z4 (Rs. 64.90 lakh) and 3 Series GT (Rs. 47.70 lakh) are among the popular cars from BMW.'
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg',
      name : 'Audi',
      model:'Model : 2015',
      // tslint:disable-next-line: max-line-length
      desc: 'Audi A3 Variants & Price: The Audi A3 is available in two variants: Premium Plus and Technology, priced from Rs 28.99 lakh to 31.99 lakh (ex-showroom pan-India). Audi A3 Engines: The A3 comes with a 1.4-litre TFSI turbocharged petrol engine that makes 150PS of power and 250Nm.'
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2016/12/03/18/57/amg-1880381__340.jpg',
      name : 'Mercedes Benz',
      model:'Model : 2015',
      // tslint:disable-next-line: max-line-length
      desc: 'The Mercedes-Benz E-Class has 2 Diesel Engine and 2 Petrol Engine on offer. ... Depending upon the variant and fuel type the E-Class has a mileage of 10.98 to 18.0 kmpl. The E-Class is a 5 seater Sedan and has a length of 4988mm, width of 1907mm and a wheelbase of 2939mm.'
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2015/05/28/23/12/auto-788747__340.jpg',
      name : 'Suzuki',
      model:'Model : 1885',
      // tslint:disable-next-line: max-line-length
      desc: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'
    },
    {
      imageUrl : 'https://cdn.pixabay.com/photo/2016/04/01/12/16/car-1300629__340.png',
      name : 'Lamborgini',
      model:'Model : 2010',
      // tslint:disable-next-line: max-line-length
      desc: 'The Lamborghini Swift has 1 Lamborghini Engine and 1 Lamborghini Engine on offer. The Diesel engine is 5000 cc while the Petrol engine is 5000 cc. Depending upon the variant and fuel type the Swift has a mileage of 3.0 to 5.0 kmpl. The Swift is a 5 seater Hatchback and has a length of 5000.'
    }]
    
  constructor() { }

  ngOnInit() {
  }

  sendCar(car) {
    console.log(car);
    this.selectedCars = car;
  }

}
