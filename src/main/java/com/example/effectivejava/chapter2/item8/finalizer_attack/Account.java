package com.example.effectivejava.chapter2.item8.finalizer_attack;

import java.math.BigDecimal;

public class Account {
    private String accountId;
    public Account(String accountId) {
        this.accountId = accountId;

        if (accountId.equals("Blocked User")) {
            throw new IllegalArgumentException("Blocked User.");
        }
    }

    public void transfer(BigDecimal amount, String to) {
        System.out.printf("transfer %f from %s to %s\n", amount, accountId, to);
    }
}
