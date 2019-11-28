import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CarParentComponent } from './car-parent.component';

describe('CarParentComponent', () => {
  let component: CarParentComponent;
  let fixture: ComponentFixture<CarParentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CarParentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CarParentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
