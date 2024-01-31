package com.proyect.creditcard.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyect.creditcard.app.entity.Card;
import com.proyect.creditcard.app.service.CardService;

@RestController
@RequestMapping("/api/cards")
public class CardController {
	
	@Autowired
	private CardService cardService;
	
	@GetMapping("{id}")
	Card getCardById(@PathVariable("id") Long id) {
		Card card = cardService.getCardById(id);
		return card;
	}
	
	@PostMapping("query")
	Card createCard(@Validated @RequestBody Card card) {
		Card newCard = cardService.createCard(card);
		return newCard;
	}
	
	@PutMapping("{id}")
	Card updateCard(@RequestBody Card card, @PathVariable("id") Long id) {
		return cardService.updateCard(card, id);
	}
	
	@PutMapping("enable/{id}")
	String enableCard(@PathVariable Long id) {
		cardService.enabledCard(id);
		return "Deactivated card";
	}
}
