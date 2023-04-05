package tn.iset.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.iset.entities.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {

}
