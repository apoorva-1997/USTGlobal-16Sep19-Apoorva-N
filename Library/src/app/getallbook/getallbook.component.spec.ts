import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetallbookComponent } from './getallbook.component';

describe('GetallbookComponent', () => {
  let component: GetallbookComponent;
  let fixture: ComponentFixture<GetallbookComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetallbookComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetallbookComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
