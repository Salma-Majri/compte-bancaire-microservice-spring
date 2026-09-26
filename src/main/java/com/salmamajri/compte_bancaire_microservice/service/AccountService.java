package com.salmamajri.compte_bancaire_microservice.service;

import com.salmamajri.compte_bancaire_microservice.dto.BankAccountRequestDTO;
import com.salmamajri.compte_bancaire_microservice.dto.BankAccountResponseDTO;
import com.salmamajri.compte_bancaire_microservice.entities.BankAccount;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
}
