package com.collections.junit.bankaccount;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), 0.001, "Balance should increase after deposit");
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount(200.0);
        account.withdraw(50.0);
        assertEquals(150.0, account.getBalance(), 0.001, "Balance should decrease after withdrawal");
    }

    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(100.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(200.0);
        });
        assertEquals("Insufficient funds", exception.getMessage());
    }

    @Test
    void testDepositNegativeAmount() {
        BankAccount account = new BankAccount(100.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-50.0);
        });
        assertEquals("Deposit amount must be positive", exception.getMessage());
    }

    @Test
    void testWithdrawNegativeAmount() {
        BankAccount account = new BankAccount(100.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-20.0);
        });
        assertEquals("Withdrawal amount must be positive", exception.getMessage());
    }
}
