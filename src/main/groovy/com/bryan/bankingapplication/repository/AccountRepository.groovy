package com.bryan.bankingapplication.repository

import com.bryan.bankingapplication.model.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository extends JpaRepository<Account, Long> {

}