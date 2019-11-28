package com.ustglobal.objectclass;

public class TestA {
	public static void main(String[] args) {

		PenDrive p = new PenDrive();
		USBPort.connect(p);

		Mouse m = new Mouse();
		USBPort.connect(m);
	}
}
