package com.proyect.creditcard.app.service.imp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.creditcard.app.entity.Card;
import com.proyect.creditcard.app.repository.CardRepository;
import com.proyect.creditcard.app.service.CardService;

@Service
public class CardServiceImp implements CardService{
	
	@Autowired
	private CardRepository cardRepository;

	@Override
	public Card getCardById(long id) {
		Optional<Card> cardOptional = cardRepository.findById(id);
		
		if(cardOptional.isPresent()) return cardOptional.get();
		else throw new IllegalStateException("Card does not exist " + id);
	}

	@Override
	public Card getCardByCardNumber(String cardnumber) {
		Optional<Card> cardOptional = cardRepository.findByCardnumber(cardnumber);
		
		if(cardOptional.isPresent()) return cardOptional.get();
		else throw new IllegalStateException("Card does not exist " + cardnumber);
	}

	@Override
	public Card createCard(Card card) {
		card.setId(null);
		card.setEnabled(true);
		if (cardRepository.existsByCardnumber(card.getCardnumber())){
			throw new IllegalStateException("Card exist with number " + card.getCardnumber());
		}
		Card newCard = cardRepository.save(card);
		return newCard;
	}

	@Override
	public Card updateCard(Card card, Long id) {
		Card existingCard = getCardById(id);
		existingCard.setBalance(card.getBalance());
		return cardRepository.save(existingCard);
	}

	@Override
	public void enabledCard(Long id) {
		Card existingCard = getCardById(id);
		existingCard.setEnabled(false);

	}

}
