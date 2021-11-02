package com.example.task222.repository;

import com.example.task222.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "payment")
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
