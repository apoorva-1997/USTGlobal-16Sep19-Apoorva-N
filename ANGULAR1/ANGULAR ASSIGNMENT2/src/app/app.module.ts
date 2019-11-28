import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/Forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RouterModule } from '@angular/router';
import { CountriesComponent } from './countries/countries.component';
import { HeaderComponent } from './header/header.component';
import { PayyavullaComponent } from './payyavulla/payyavulla.component';
import {HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    CountriesComponent,
    HeaderComponent,
    PayyavullaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: 'country', component:CountriesComponent},
      {path: 'pay', component:PayyavullaComponent},
       
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
