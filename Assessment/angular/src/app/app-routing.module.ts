import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { AddProductComponent } from './add-product/add-product.component';
import { HomeComponent } from './home/home.component';
import { SearchbyNameComponent } from './searchby-name/searchby-name.component';
import { SearchbyCompanyComponent } from './searchby-company/searchby-company.component';
import { SearchCategoryComponent } from './search-category/search-category.component';


const routes: Routes = [
  { path: '/', component: HomeComponent },
  { path: 'add', component: AddProductComponent },
  { path: 'searchbyname', component: SearchbyNameComponent },
  { path: 'searchbycompany', component: SearchbyCompanyComponent },
  { path: 'searchbycompany', component: SearchCategoryComponent },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
