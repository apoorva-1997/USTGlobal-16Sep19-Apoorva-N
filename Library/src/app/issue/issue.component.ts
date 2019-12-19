import { Component, OnInit } from '@angular/core';
import { LmspService } from '../lmsp.service';

@Component({
  selector: 'app-issue',
  templateUrl: './issue.component.html',
  styleUrls: ['./issue.component.css']
})
export class IssueComponent implements OnInit {

  constructor(private auth: LmspService) { }

  user;
  uid;
  bid;
  date = new Date();

  ngOnInit() {
  }
  issue(bid, uid) {
    const book = JSON.parse(localStorage.getItem('issueBook'));
    this.bid = book.bookbeans[0].bid;
    this.uid = book.adminbean[0].id;

    this.auth.issueBook(bid, uid).subscribe(res => {
      console.log('res=', res);
    });
  }

  reject(uid, bid) {
    const book = JSON.parse(localStorage.getItem('issueBook'));
    this.bid = book.bookbeans[0].bid;
    this.uid = book.adminbean[0].id;
  }

}
