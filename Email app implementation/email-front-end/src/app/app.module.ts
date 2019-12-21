import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { ForgotpassComponent } from './forgotpass/forgotpass.component';
import { UserComponent } from './user/user.component';
import { ComposeemailComponent } from './user/composeemail/composeemail.component';
import { ChangepasswordComponent } from './user/changepassword/changepassword.component';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    LoginComponent,
    HeaderComponent,
    ForgotpassComponent,
    UserComponent,
    ComposeemailComponent,
    ChangepasswordComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: 'register', component: RegisterComponent },
      { path: 'login', component: LoginComponent },
      { path: 'user', component: UserComponent},
      { path: 'email', component: ComposeemailComponent},
      { path: 'changepassword', component: ChangepasswordComponent},
      { path: 'forgot', component: ForgotpassComponent}

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
