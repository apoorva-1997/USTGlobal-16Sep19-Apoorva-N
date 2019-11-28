import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './data-binding/two-way-binding/two-way-binding.component';
import { DirectivesComponent } from './directives/directives.component';
import { StructuralDirectivesComponent } from './directives/structural-directives/structural-directives.component';
import { NgIfComponent } from './directives/structural-directives/ng-if/ng-if.component';
import { NgForComponent } from './directives/structural-directives/ng-for/ng-for.component';
import { NgSwitchComponent } from './directives/structural-directives/ng-switch/ng-switch.component';
import { CostumDirective } from './costum.directive';
import { RegisterComponent } from './register/register.component';
import { Form1Component } from './form1/form1.component';
import { Form2Component } from './form2/form2.component';
import { Form3Component } from './form3/form3.component';
import { Form4Component } from './form4/form4.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { HttpClientModule} from '@angular/common/http';
import { WebComponent } from './web/web.component';
import { DollerPipe } from './doller.pipe';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';




@NgModule({
  declarations: [
    AboutComponent,
    AppComponent,
    HeaderComponent,
    HomeComponent,
    HelpComponent,
    FooterComponent,
    // DataBindingComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayBindingComponent,
    EventBindingComponent,
    DirectivesComponent,
    StructuralDirectivesComponent,
    NgIfComponent,
    DirectivesComponent,
    StructuralDirectivesComponent,
    NgIfComponent,
    NgForComponent,
    NgSwitchComponent,
    CostumDirective,
    RegisterComponent,
    Form1Component,
    Form2Component,
    Form3Component,
    Form4Component,
    ReactiveFormComponent,
    WebComponent,
    DollerPipe,
    CommentComponent,
    CommentDetailsComponent
    ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: 'home', component: HomeComponent},
      {path: 'about', component: AboutComponent},
      {path: 'help', component: HelpComponent},
      {path: 'property-binding', component: PropertyBindingComponent},
      {path: 'event-binding', component: EventBindingComponent},
      {path: 'twoway-binding', component: TwoWayBindingComponent},
      {path: 'login', component: NgIfComponent},
      {path: 'ng-for', component: NgForComponent},
      {path: 'switch' , component: NgSwitchComponent},
      {path: 'register' , component: RegisterComponent},
      {path: 'form-1' , component : Form1Component},
      {path : 'form-2' , component : Form2Component},
      {path : 'form-3', component : Form3Component},
      {path : 'form-4' , component : Form4Component},
      {path : 'reactive-form', component : ReactiveFormComponent},
      {path: 'web', component: WebComponent},
      {path: 'comment', component: CommentComponent},
      {path: 'comment-details', component: CommentDetailsComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
