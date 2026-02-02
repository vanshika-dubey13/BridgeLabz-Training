package com.streamapi;

import java.util.*;
import java.util.stream.*;

class Claim {
	//attributes
    String claimType;
    double amount;

    //constructor
    Claim(String claimType, double amount) {
        this.claimType = claimType;
        this.amount = amount;
    }

    //method to display claim type
    public String getClaimType() {
        return claimType;
    }

    //method to get amount
    public double getAmount() {
        return amount;
    }
}

public class InsuranceAnalysis {
    public static void main(String[] args) {

        List<Claim> claims = List.of(
            new Claim("Health", 5000),
            new Claim("Vehicle", 12000),
            new Claim("Health", 8000),
            new Claim("Property", 20000),
            new Claim("Vehicle", 15000)
        );

        Map<String, Double> avgClaimAmountByType =
            claims.stream()
                  .collect(Collectors.groupingBy(
                      Claim::getClaimType,
                      Collectors.averagingDouble(Claim::getAmount)
                  ));

        avgClaimAmountByType.forEach((type, avg) ->
            System.out.println(type + " : " + avg)
        );
    }
}

