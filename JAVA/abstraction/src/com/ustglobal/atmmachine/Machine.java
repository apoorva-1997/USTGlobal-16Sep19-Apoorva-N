package com.ustglobal.atmmachine;

public class Machine {
	
	void slot(ATM a) { 
		a.validateCard();
		a.getInfo();
	}
}
