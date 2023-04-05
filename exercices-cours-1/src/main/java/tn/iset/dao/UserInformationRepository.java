package tn.iset.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.iset.entities.UserInformations;

public interface UserInformationRepository extends JpaRepository<UserInformations,Long>  {

}
