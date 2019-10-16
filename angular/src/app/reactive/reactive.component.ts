import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormControlName, Validators } from '@angular/forms';
@Component({
  selector: 'app-reactive',
  templateUrl: './reactive.component.html',
  styleUrls: ['./reactive.component.css']
})
export class ReactiveComponent implements OnInit {
  get movie() {
    return this.form.get('movie');
  }
  get title() {
    return this.form.get('title');
  }
  get img() {
    return this.form.get('imgUrl');
  }
  get description() {
    return this.form.get('description');
  }
  constructor() { }

  form = new FormGroup({
    movie : new FormControl('', [Validators.required, ]),
    title : new FormControl('', [Validators.required]),
    imgUrl : new FormControl('', [Validators.required]),
    description : new FormControl('', [Validators.required]),
  });

  ngOnInit() {
  }

}
