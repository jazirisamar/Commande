package tn.iset.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.iset.entities.CommandLine;

public interface CommandLineRepository  extends JpaRepository<CommandLine,Long> {

}
