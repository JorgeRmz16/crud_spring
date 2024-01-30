package com.proyect.creditcard.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.proyect.creditcard.app.entity.Card;
import java.util.Optional;


public interface CardRepository extends CrudRepository<Card, Long>{
	Optional<Card>  findByCardNumber(String cardNumber);
	boolean existsByCardName (String cardNumber);

}
