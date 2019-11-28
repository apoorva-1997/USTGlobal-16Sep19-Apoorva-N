package com.ustglobal.exception.customisedcheckedexception;

public class InvalidAmountException extends Exception{
private String message = "Daily limits is 400000";

@Override
public String getMessage() {
	return message;
}
}
