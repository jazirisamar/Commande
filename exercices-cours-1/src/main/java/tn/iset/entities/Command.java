package tn.iset.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Command implements Serializable {
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idCommand;
private Date commandDate;

@ManyToOne
@JoinColumn(name = "utilisateur_id")
private Utilisateur utilisateur;

@OneToOne(mappedBy = "command", cascade = CascadeType.ALL)
private Payment payment;

@OneToMany(mappedBy = "command", fetch=FetchType.LAZY)
private Collection<CommandLine> commandLine;
}
