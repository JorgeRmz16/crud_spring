package com.proyect.creditcard.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.proyect.creditcard.app.entity.Card;
import java.util.Optional;


public interface CardRepository extends CrudRepository<Card, Long>{
	Optional<Card>  findByCardnumber(String cardnumber);
	boolean existsByCardnumber (String cardnumber);

}
