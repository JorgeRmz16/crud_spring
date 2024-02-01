package com.proyect.creditcard.app.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="credit_cards")
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="Numero de tarjeta requerido")
	@Size(min=16, max=16, message = "16 digitos requeridos")
	@Column(nullable = false, length = 16)
	private String cardnumber;
	
	@NotNull(message="Ingrese la cantidad")
	@Min(0)
	private Float balance;
	
	private boolean enabled; 
	@PrePersist
	public void prePersist() {
		enabled = true;
	}
}
