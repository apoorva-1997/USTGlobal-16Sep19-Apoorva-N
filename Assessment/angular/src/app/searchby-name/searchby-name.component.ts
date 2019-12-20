import { Component, OnInit } from '@angular/core';
import { SmsService } from '../sms.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-searchby-name',
  templateUrl: './searchby-name.component.html',
  styleUrls: ['./searchby-name.component.css']
})
export class SearchbyNameComponent implements OnInit {
  product: any;

  constructor(private auth: SmsService) { }

  searchbyname(search: NgForm) {
    console.log(search.value);
    this.auth.searchbyn(search.value).subscribe(res => {
      this.product = res.product;

      if (res && res.message === 'Success') {
        console.log(res);

      } else {
        alert('product is not found');
      }
      // tslint:disable-next-line: no-unused-expression
      search.reset;
    });
  }
  ngOnInit() {
  }
}
