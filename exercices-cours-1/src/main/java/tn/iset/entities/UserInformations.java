package tn.iset.entities;

import java.io.Serializable;


import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class UserInformations implements Serializable {
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idInformation;
private String address;
private String city;
private String email;
private String phoneNumber;

@OneToOne
@JoinColumn(name = "utilisateur_id")
private Utilisateur utilisateur ;

}
