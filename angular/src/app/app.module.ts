import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import {RouterModule} from '@angular/router';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { TempformComponent } from './tempform/tempform.component';
import { ReactiveComponent } from './reactive/reactive.component';
import { MovieComponent } from './movie/movie.component';
import { HttpClientModule} from '@angular/common/http';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    TempformComponent,
    ReactiveComponent,
    MovieComponent,

  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: 'form', component: TempformComponent},
      {path: 'reactive', component: ReactiveComponent},
      {path: 'picture',component:MovieComponent}

    ])
  ,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
