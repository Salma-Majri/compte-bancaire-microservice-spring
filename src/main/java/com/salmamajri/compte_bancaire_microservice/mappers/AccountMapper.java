package com.salmamajri.compte_bancaire_microservice.mappers;

import com.salmamajri.compte_bancaire_microservice.dto.BankAccountResponseDTO;
import com.salmamajri.compte_bancaire_microservice.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public BankAccountResponseDTO fromBankAccount(BankAccount bankAccount){
        BankAccountResponseDTO bankAccountResponseDTO = new BankAccountResponseDTO();
        BeanUtils.copyProperties(bankAccount, bankAccountResponseDTO);
        return bankAccountResponseDTO;
    }
}