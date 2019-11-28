import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-web',
  templateUrl: './web.component.html',
  styleUrls: ['./web.component.css']
})
export class WebComponent implements OnInit {
  constructor(private http: HttpClient) {
    this.getNews();
   }
news;
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
getNews() {
  this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=f9cc5567bf5b4c5b88955744f97c4fd6').subscribe(data =>{
this.news = data.articles;
  }
    , err => {
      console.log(err);
    }, () => {
    console.log('news got successfully');
});
 }
}
