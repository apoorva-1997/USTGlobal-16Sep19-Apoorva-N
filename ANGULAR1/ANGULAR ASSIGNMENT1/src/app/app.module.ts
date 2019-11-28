import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RouterModule } from '@angular/router';
import { BikeChildComponent } from './bike-child/bike-child.component';
import { BikeParentComponent } from './bike-parent/bike-parent.component';
import { CarChildComponent } from './car-child/car-child.component';
import { CarParentComponent } from './car-parent/car-parent.component';
import { HeaderComponent } from './header/header.component';
import { LaptopChildComponent } from './laptop-child/laptop-child.component';
import { LaptopParentComponent } from './laptop-parent/laptop-parent.component';
import { MobileChildComponent } from './mobile-child/mobile-child.component';
import { MobileParentComponent } from './mobile-parent/mobile-parent.component';
import { MoviesChildComponent } from './movies-child/movies-child.component';
import { MoviesParentComponent } from './movies-parent/movies-parent.component';
import { TechComponent } from './tech/tech.component';

@NgModule({
  declarations: [
    AppComponent,
    BikeChildComponent,
    BikeParentComponent,
    CarChildComponent,
    CarParentComponent,
    HeaderComponent,
    LaptopChildComponent,
    LaptopParentComponent,
    MobileChildComponent,
    MobileParentComponent,
    MoviesChildComponent,
    MoviesParentComponent,
    TechComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot([
      {path: 'bike', component: BikeParentComponent},
      {path: 'movie', component: MoviesParentComponent},
      {path: 'mobile', component: MobileParentComponent},
      {path: 'laps', component: LaptopParentComponent},
      {path: 'car', component: CarParentComponent},
      {path: 'tech', component: TechComponent}

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
