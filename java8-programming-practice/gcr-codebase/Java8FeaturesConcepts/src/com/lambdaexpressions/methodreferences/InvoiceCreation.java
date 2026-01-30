package com.lambdaexpressions.methodreferences;

import java.util.*;
import java.util.stream.Collectors;

class Invoice {
	//attribute
    int transactionId;

    //constructor
    Invoice(int transactionId) {
        this.transactionId = transactionId;
    }

    //odisplaying invoice details
    @Override
    public String toString() {
        return "Invoice for Transaction ID: " + transactionId;
    }
}

public class InvoiceCreation {

	//main method
    public static void main(String[] args) {

        List<Integer> transactionIds =
                Arrays.asList(7001, 7002, 7003);

        // Constructor reference
        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}

