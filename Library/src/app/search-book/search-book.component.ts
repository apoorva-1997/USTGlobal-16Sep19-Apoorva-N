import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { LmspService } from '../lmsp.service';
import { format } from 'url';

@Component({
  selector: 'app-search-book',
  templateUrl: './search-book.component.html',
  styleUrls: ['./search-book.component.css']
})


export class SearchBookComponent implements OnInit {
  book;
  // tslint:disable-next-line: variable-name
  user_detail: any;
  uid: number;
  error: string;
  books: any[];
  constructor(private http: HttpClient, public auth: LmspService) {
  }


  // searchBook(bid) {
  //   this.auth.searchBook(bid).subscribe(res => {
  //     this.book = res.bookbeans[0];
  //     console.log(res);
  //     if (res.statusCode === 401) {
  //       this.error = 'Book is not found';
  //     }


  //   });
  // }

  searchBook(search: NgForm) {
    console.log(search.value);
    this.auth.searchBook(search.value).subscribe(res => {
      this.book = res.bookbeans[0];

      if (res && res.message === 'Success') {
        console.log(res);

      } else {
        alert('Book is not found');
      }
      // tslint:disable-next-line: no-unused-expression
      search.reset;
    });
  }

  requestBook(books) {
    const user = JSON.parse(localStorage.getItem('userDetails'));
    console.log(' user = ', user);
    this.user_detail = user.adminbeans[0].id;

    this.auth.requestBook(books.bid, this.user_detail).subscribe(data => {
      this.book = data.bookbeans[0];
      if (data && data.message === 'Success') {
        localStorage.setItem('issueBook', JSON.stringify(data));
      }

      console.log(data);
    });
  }

  getAll() {
    this.auth.getBook().subscribe(data => {
      this.books = data.bookbeans;
      console.log(this.books);
    });
  }
  ngOnInit() {

  }
  // tslint:disable-next-line: use-lifecycle-interface
  ngOnDestroy() {
    this.error = null;
  }


}

