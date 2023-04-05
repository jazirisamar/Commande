package tn.iset.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.iset.entities.Command;

public interface CommandRepository extends JpaRepository<Command,Long> {

}
