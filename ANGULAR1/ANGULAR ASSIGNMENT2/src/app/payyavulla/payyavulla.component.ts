import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-payyavulla',
  templateUrl: './payyavulla.component.html',
  styleUrls: ['./payyavulla.component.css']
})
export class PayyavullaComponent implements OnInit {

  enews;
  news;
  sports;

  constructor(private http : HttpClient) { 


    this.getEnter();
    this.getNews();
    this.getSports();
  }

  getEnter() {
    // tslint:disable-next-line: max-line-length
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=06b95a5c1a644562af23f91b52a92285').subscribe( data => {
      this.enews = data.articles;
    }, err => {
      console.log(err);
    }, () => {
      console.log('entertainment news got successfully');
    });
  }


  getNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=06b95a5c1a644562af23f91b52a92285').subscribe( data => {
    this.news = data.articles;
    }, err => {
        console.log(err);
    }, () => {
        console.log('news got successfully');
    });
}

  getSports() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=06b95a5c1a644562af23f91b52a92285').subscribe( data => {
      this.sports = data.articles;
    }, err =>{
      console.log(err);
    }, () => {
      console.log("sports news get succesfully");
    });
  }

  ngOnInit() {
  }

}
