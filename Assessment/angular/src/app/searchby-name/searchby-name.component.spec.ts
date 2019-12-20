import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchbyNameComponent } from './searchby-name.component';

describe('SearchbyNameComponent', () => {
  let component: SearchbyNameComponent;
  let fixture: ComponentFixture<SearchbyNameComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchbyNameComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchbyNameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
