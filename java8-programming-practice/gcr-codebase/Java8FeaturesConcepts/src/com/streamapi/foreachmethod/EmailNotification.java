package com.streamapi.foreachmethod;

import java.util.*;

public class EmailNotification {
    
	//method to send email notification
    public static void sendEmailNotification(String email) {
        System.out.println("Sending notification email to: " + email);
    }

    public static void main(String[] args) {

        List<String> emails = List.of(
            "anil@example.com",
            "zainab@example.com",
            "jasmin@example.com"
        );

        emails.forEach(email -> sendEmailNotification(email));
    }
}

