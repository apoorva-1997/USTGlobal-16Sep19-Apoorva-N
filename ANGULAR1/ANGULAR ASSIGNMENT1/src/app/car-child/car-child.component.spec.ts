import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CarChildComponent } from './car-child.component';

describe('CarChildComponent', () => {
  let component: CarChildComponent;
  let fixture: ComponentFixture<CarChildComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CarChildComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CarChildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
