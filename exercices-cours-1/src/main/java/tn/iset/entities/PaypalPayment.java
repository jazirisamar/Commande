package tn.iset.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@DiscriminatorValue("PAYPAL")
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class PaypalPayment extends Payment {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String accountNumber;
	

}
