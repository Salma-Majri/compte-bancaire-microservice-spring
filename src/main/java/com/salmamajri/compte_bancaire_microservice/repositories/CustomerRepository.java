package com.salmamajri.compte_bancaire_microservice.repositories;

import com.salmamajri.compte_bancaire_microservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
