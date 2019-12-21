import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private service: AuthService, private router: Router) { }
  get isLoggedIn() {
    return this.service.isLLoggedIn();
  }

  logout() {
    this.service.isLoggedIn = false;
    this.router.navigateByUrl('/login');
  }

  ngOnInit() {
  }

}
