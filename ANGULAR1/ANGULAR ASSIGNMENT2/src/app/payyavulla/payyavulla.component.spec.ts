import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PayyavullaComponent } from './payyavulla.component';

describe('PayyavullaComponent', () => {
  let component: PayyavullaComponent;
  let fixture: ComponentFixture<PayyavullaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PayyavullaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PayyavullaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
