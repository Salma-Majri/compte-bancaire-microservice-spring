package com.salmamajri.compte_bancaire_microservice.repositories;

import com.salmamajri.compte_bancaire_microservice.entities.BankAccount;
import com.salmamajri.compte_bancaire_microservice.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
    List<BankAccount> findByType(AccountType type);
}