import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchbyCompanyComponent } from './searchby-company.component';

describe('SearchbyCompanyComponent', () => {
  let component: SearchbyCompanyComponent;
  let fixture: ComponentFixture<SearchbyCompanyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchbyCompanyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchbyCompanyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
