import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.css']
})
export class MovieComponent implements OnInit {
  [x: string]: any;

  constructor(private http: HttpClient) { }
movies = [{
  imgUrl :'https://m.media-amazon.com/images/M/MV5BZGI5YTFhN2ItMjhlOC00NzlmLTgzM2EtZWEyNmY5NmMxYWNmXkEyXkFqcGdeQXVyNTE0NDY5Njc@._V1_SX300.jpg',
  name :'Milana',
},{
imgUrl :"https://m.media-amazon.com/images/M/MV5BNGVjNWI4ZGUtNzE0MS00YTJmLWE0ZDctN2ZiYTk2YmI3NTYyXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg",
name : 'joker'
},]
  ngOnInit() {
  }


}
