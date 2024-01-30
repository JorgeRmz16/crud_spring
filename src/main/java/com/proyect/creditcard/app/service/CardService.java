package com.proyect.creditcard.app.service;

import com.proyect.creditcard.app.entity.Card;

public interface CardService {

	Card getCardById(long id);
	Card getCardByCardNumber(String cardNumber);
	Card createCard(Card card);
	Card updateCard(Card card, Long id);
	void enabledCard(Long id);
}
