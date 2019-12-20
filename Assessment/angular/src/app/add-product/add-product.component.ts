import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { SmsService } from '../sms.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {
  products: any;

  constructor(private auth: SmsService, private router: Router) { }

  addproduct(add: NgForm) {
    console.log(add.value);
    this.auth.addproduct(add.value).subscribe(res => {
      console.log('Response of add product', res);
      if (res && res.message === 'Success') {
        this.router.navigateByUrl('/');
      }
      console.log(this.products);
    }, err => {
      console.log(err);
    });
  }

  ngOnInit() {
  }

}
