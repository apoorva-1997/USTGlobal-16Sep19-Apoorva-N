import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddProductComponent } from './add-product/add-product.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { SearchbyNameComponent } from './searchby-name/searchby-name.component';
import { SearchbyCompanyComponent } from './searchby-company/searchby-company.component';
import { SearchCategoryComponent } from './search-category/search-category.component';


@NgModule({
  declarations: [
    AppComponent,
    AddProductComponent,
    HeaderComponent,
    HomeComponent,
    SearchbyNameComponent,
    SearchbyCompanyComponent,
    SearchCategoryComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
