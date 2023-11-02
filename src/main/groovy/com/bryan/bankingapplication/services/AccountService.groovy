package com.bryan.bankingapplication.services

import com.bryan.bankingapplication.model.Account
import com.bryan.bankingapplication.repository.AccountRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AccountService {

    @Autowired
    AccountRepository accountRepository;

    Account createAccount(Account account) {
        return accountRepository.save(account)
    }

    Optional<Account> getAccount(Long id) {
        return accountRepository.findById(id)
    }

    Account deposit(Long id, double amount) {
        Account account = getAccount(id).orElseThrow(() -> new RuntimeException("Account not found"))
        account.setBalance(account.getBalance() + amount)
        return accountRepository.save(account)
    }

    Account withdraw(Long id, double amount) {
        Account account = getAccount(id).orElseThrow(() -> new RuntimeException("Account not found"))
        if (account.getBalance() < amount) {
            throw new RuntimeException("Insufficient funds")
        }
        account.setBalance(account.getBalance() - amount)
        return accountRepository.save(account)
    }

}
