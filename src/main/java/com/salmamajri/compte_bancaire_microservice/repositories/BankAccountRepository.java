package com.salmamajri.compte_bancaire_microservice.repositories;

import com.salmamajri.compte_bancaire_microservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
