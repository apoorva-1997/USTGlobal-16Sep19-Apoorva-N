package com.ustglobal.phonesimulator.util;

import com.ustglobal.phonesimulator.dao.PhoneDAO;
import com.ustglobal.phonesimulator.dao.PhoneImplDAO;

public class PhoneManager {
	
	private PhoneManager(){}
	
	public static PhoneDAO getPhoneDAO() {
		return new  PhoneImplDAO();
	}//end of getPhoneDAO()

}//end of PhoneManager
