package com.proyect.creditcard.app.service;

import com.proyect.creditcard.app.entity.Card;

public interface CardService {

	Card getCardById(long id);
	Card getCardByCardnumber(String cardnumber);
	Card createCard(Card card);
	Card updateCard(Card card, Long id);
	void enabledCard(Long id);
}
