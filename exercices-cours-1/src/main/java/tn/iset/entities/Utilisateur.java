package tn.iset.entities;

import java.io.Serializable;
import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor

public class Utilisateur implements Serializable{
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String login;
private String password;
private int connectionNumber;

@ManyToMany (mappedBy = "utilisateur", fetch=FetchType.LAZY)
private Collection<Role> role;

@OneToOne(mappedBy = "utilisateur", cascade = CascadeType.ALL)
private UserInformations UserInformations;

@OneToMany(mappedBy = "utilisateur", fetch=FetchType.LAZY)
private Collection<Command> command;
}
