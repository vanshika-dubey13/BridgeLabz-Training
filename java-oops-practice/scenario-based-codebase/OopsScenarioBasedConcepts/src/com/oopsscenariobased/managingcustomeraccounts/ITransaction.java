package com.oopsscenariobased.managingcustomeraccounts;

//creating interface
interface ITransaction {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}
