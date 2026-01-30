package com.interfaces.staticmethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils {

	//static method
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
    
}

public class DateFormatUtility {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        String format1 = DateUtils.formatDate(today, "dd/MM/yyyy");
        String format2 = DateUtils.formatDate(today, "MMMM dd, yyyy");

        System.out.println("Format 1: " + format1);
        System.out.println("Format 2: " + format2);
    }
    
}

