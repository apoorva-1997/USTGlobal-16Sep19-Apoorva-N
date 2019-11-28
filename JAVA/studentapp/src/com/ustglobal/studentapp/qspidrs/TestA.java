package com.ustglobal.studentapp.qspidrs;

//import com.ustglobal.studentapp.jspidrs.Angular;
//import com.ustglobal.studentapp.jspidrs.React;

import com.ustglobal.studentapp.jspidrs.*;

public class TestA {
	public static void main(String[] args) {
		QTP q = new QTP();
		q.teachingQTP();

		Selenium s = new Selenium();
		s.teachSelenium();

		//	com.ustglobal.studentapp.jspidrs.Angular a = new com.ustglobal.studentapp.jspidrs.Angular();
		//	a.teachAngular();

		Angular a = new Angular();
		a.teachAngular();

		React r = new React();
		r.teachingReact();
	}
}
