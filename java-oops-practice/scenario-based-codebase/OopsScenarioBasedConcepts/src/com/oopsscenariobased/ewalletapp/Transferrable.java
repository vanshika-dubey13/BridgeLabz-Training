package com.oopsscenariobased.ewalletapp;

//interface for calculating amount to be transferred
interface Transferrable {
    void transferTo(User receiver, double amount);
}
