import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { SmsService } from '../sms.service';

@Component({
  selector: 'app-searchby-company',
  templateUrl: './searchby-company.component.html',
  styleUrls: ['./searchby-company.component.css']
})
export class SearchbyCompanyComponent implements OnInit {
  product: any;

  constructor(private auth: SmsService) { }

  searchbycompany(search: NgForm) {
    console.log(search.value);
    this.auth.searchbycompany(search.value).subscribe(res => {
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
