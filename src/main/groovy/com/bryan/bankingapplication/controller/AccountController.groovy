package com.bryan.bankingapplication.controller

import com.bryan.bankingapplication.model.Account
import com.bryan.bankingapplication.services.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/accounts")
class AccountController {

    @Autowired
    AccountService accountService

    @PostMapping
    Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account)
    }

    @GetMapping("/{id}")
    Account getAccount(@PathVariable Long id) {
        return accountService.getAccount(id).orElseThrow(() -> new RuntimeException("Account not found"))
    }

    @PostMapping("/{id}/deposit")
    Account deposit(@PathVariable Long id, @RequestBody Map<String, Double> request) {
        Double amount = request.get("amount")
        return accountService.deposit(id, amount)
    }

    @PostMapping("/{id}/withdraw")
    Account withdraw(@PathVariable Long id, @RequestBody Map<String, Double> request) {
        Double amount = request.get("amount")
        return accountService.withdraw(id, amount)
    }
}
