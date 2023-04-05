package tn.iset.entities;

import jakarta.persistence.DiscriminatorValue;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@DiscriminatorValue("CREDITCARD")
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class CreditCardPayment extends Payment{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String CardNumber;
	private String expiratioDate;
}

