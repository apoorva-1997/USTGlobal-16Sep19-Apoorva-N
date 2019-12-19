import { Component, OnInit } from '@angular/core';
import { LmspService } from '../lmsp.service';
import { SearchBookComponent } from '../search-book/search-book.component';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-getallbook',
  templateUrl: './getallbook.component.html',
  styleUrls: ['./getallbook.component.css']
})
export class GetallbookComponent implements OnInit {

  books: any[];
  bid;
  constructor(private auth: LmspService) {
    this.getAll();
  }

  ngOnInit() {
  }

  getAll() {
    this.auth.getBook().subscribe(data => {
      this.books = data.bookbeans;
      console.log(this.books);
    });
  }



  deleteBooK(book) {
    this.auth.removeBook(book.bid).subscribe(data => {
      console.log(data);
      if (data.statusCode === 201) {
        this.books.splice(this.books.indexOf(book), 1);
      }
    });
  }


}


