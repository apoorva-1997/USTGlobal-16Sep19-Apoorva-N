import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LmspService } from '../lmsp.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private router: Router , private auth: LmspService) { }

  get isAdminLogin() {
    return this.auth.isAdmin();
  }

  get isUserLogin() {
    return this.auth.isUser();
  }

  logout() {
    this.auth.isAdminLogin = false;
    this.auth.isUserLogin = false;
    this.router.navigateByUrl('/login');
  }
  ngOnInit() {
  }

}
