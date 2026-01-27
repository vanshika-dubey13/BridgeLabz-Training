package com.collections.junit.dateformatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

    // Converts yyyy-MM-dd to dd-MM-yyyy
    public static String formatDate(String inputDate) throws ParseException {
        if (inputDate == null || inputDate.isEmpty()) {
            throw new IllegalArgumentException("Date cannot be null or empty");
        }

        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        inputFormat.setLenient(false); // strict parsing

        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date date = inputFormat.parse(inputDate); // throws ParseException if invalid
        return outputFormat.format(date);
    }
}
