package com.proyect.creditcard.app.controller.exception;

public class CardNotFoundException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CardNotFoundException(String cardNumber) {
        super("Card not found with card number: " + cardNumber);
    }
}
