import { TestBed } from '@angular/core/testing';

import { LmspService } from './lmsp.service';

describe('LmspService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: LmspService = TestBed.get(LmspService);
    expect(service).toBeTruthy();
  });
});
