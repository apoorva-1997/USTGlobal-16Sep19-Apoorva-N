package com.ustglobal.exception.customisedcheckedexception;

public class Validator {
	void checkAmount(int amount) throws InvalidAmountException {
		if(amount > 40000) {
			throw new InvalidAmountException();
	}
}
}