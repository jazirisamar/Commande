package tn.iset.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.iset.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Long> {

}
