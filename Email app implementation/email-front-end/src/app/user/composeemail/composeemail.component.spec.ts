import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ComposeemailComponent } from './composeemail.component';

describe('ComposeemailComponent', () => {
  let component: ComposeemailComponent;
  let fixture: ComponentFixture<ComposeemailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ComposeemailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ComposeemailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
