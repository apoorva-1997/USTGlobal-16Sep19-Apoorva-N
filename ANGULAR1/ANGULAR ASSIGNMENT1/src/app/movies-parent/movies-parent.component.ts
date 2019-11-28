import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movies-parent',
  templateUrl: './movies-parent.component.html',
  styleUrls: ['./movies-parent.component.css']
})
export class MoviesParentComponent implements OnInit {
 selectedMovies;
  Movies = [
    {
      poster : 'https://image.shutterstock.com/image-photo/avatar-woman-magical-forest-260nw-308973533.jpg',
      name : 'Avatar',
      rate : 'Ratings : 10/10',
      desc : 'Jake, a paraplegic marine, replaces his brother on the Navi inhabited Pandora for a corporate mission. He is accepted by the natives as one of their own but he must decide where his loyalties lie.'
    },
    {
      poster : 'https://image.shutterstock.com/image-photo/natural-quartz-sandstone-pillar-avatar-260nw-1148627891.jpg',
      name : 'Life of Pie',
      rate : 'Ratings : 5/10',
      desc : 'Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death.'
    },
    {
      poster : 'https://cdn.pixabay.com/photo/2016/03/21/20/01/chaplin-1271422__340.jpg',
      name : 'Charlie-chaplin',
      rate : 'Ratings : 6/10',
      // tslint:disable-next-line: max-line-length
      desc : 'Sir Charles Spencer Chaplin KBE was an English comic actor, filmmaker, and composer who rose to fame in the era of silent film. He became a worldwide icon through his screen persona, "The Tramp", and is considered one of the most important figures in the history of the film industry.'
    },
    {
      poster : 'https://cdn.pixabay.com/photo/2019/04/08/16/27/spiderman-4112322__340.jpg',
      name : 'SpiderMan',
      rate : 'Ratings : 9/10 ',
      desc : 'Spider-Man is a fictional superhero created by writer-editor Stan Lee and writer-artist Steve Ditko. He first appeared in the anthology comic book Amazing Fantasy #15 in the Silver Age of Comic Books.'
    },
    {
      poster : 'https://cdn.pixabay.com/photo/2019/08/25/06/43/captain-america-4428842__340.jpg',
      name : 'Captain America',
      rate : 'Ratings : 10/10',
      desc : 'After Steve Rogers decides to volunteer as a guinea pig in an experiment, his weak body is fully enhanced. A secret Nazi organisation tries to exploit the technology and he must stand against them.'
    },
  ]

  constructor() { }

  ngOnInit() {
  }

  film (movie){
    console.log(movie);
    this.selectedMovies = movie;
  }
}
