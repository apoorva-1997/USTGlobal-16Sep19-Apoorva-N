package com.ustglobal.phonesimulator.dao;

import java.util.List;

import com.ustglobal.phonesimulator.dto.PhoneSimulator;

public interface PhoneDAO {

	public List<PhoneSimulator> getAllContact();
	public PhoneSimulator searchContact(String Name);
//	public int addContact(String Name, int Number, String Groups);
	public int deleteContact(String Name);
	public int editContact( String Name, int Number, String Groups);
	public int insertContact(PhoneSimulator p);
}
