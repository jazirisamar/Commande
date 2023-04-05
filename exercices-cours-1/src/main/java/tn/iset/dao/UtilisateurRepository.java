package tn.iset.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import tn.iset.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
	
	
}
