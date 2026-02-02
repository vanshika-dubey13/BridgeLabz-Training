package com.streamapi;

import java.time.LocalDate;
import java.util.*;

/*creating a class to use Stream API to filter out members whose membership expires within the next 30 days.abstract
*/

//Member class to store member details
class Member {
	//attributes
    String name;
    LocalDate membershipExpiry;

    //constructor
    Member(String name, LocalDate membershipExpiry) {
        this.name = name;
        this.membershipExpiry = membershipExpiry;
    }

    //method to get expiry date
    public LocalDate getExpiryDate() {
        return membershipExpiry;
    }

    //overrding method to display member details
    @Override
    public String toString() {
        return name + " - Expiry: " + membershipExpiry;
    }
}

public class GymMembership {
	public static void main(String[] args) {

    	//adding list of members with expiry 
        List<Member> members = List.of(
            new Member("Alex", LocalDate.now().plusDays(10)),
            new Member("Bob", LocalDate.now().plusDays(40)),
            new Member("Clara", LocalDate.now().plusDays(25)),
            new Member("Diana", LocalDate.now().minusDays(5))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        members.stream()
            .filter(m -> !m.getExpiryDate().isBefore(today)
                      && !m.getExpiryDate().isAfter(next30Days))
            .forEach(System.out::println);
    }
}
