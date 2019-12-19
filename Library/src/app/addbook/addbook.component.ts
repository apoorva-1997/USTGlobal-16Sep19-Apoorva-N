import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { LmspService } from '../lmsp.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addbook',
  templateUrl: './addbook.component.html',
  styleUrls: ['./addbook.component.css']
})
export class AddbookComponent implements OnInit {

  books: any;
  constructor(private auth: LmspService, private router: Router) { }

  addBook(add: NgForm) {
    console.log(add.value);
    this.auth.addBook(add.value).subscribe(res => {
      console.log('Response of Book', res);
      if (res && res.message === 'Success') {
        this.router.navigateByUrl('/getall');

      }
      console.log(this.books);
    }, err => {
      console.log(err);
    });
  }

  ngOnInit() {
  }

}
