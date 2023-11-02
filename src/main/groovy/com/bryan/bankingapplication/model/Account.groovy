package com.bryan.bankingapplication.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import lombok.Getter
import lombok.Setter

@Getter
@Setter
@Entity
class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id
    String accountHolderName
    double balance
}
