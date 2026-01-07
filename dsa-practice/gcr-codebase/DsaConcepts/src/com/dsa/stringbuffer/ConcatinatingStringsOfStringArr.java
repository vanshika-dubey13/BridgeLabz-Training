package com.dsa.stringbuffer;

import java.util.Scanner;

import java.util.Scanner;

public class ConcatinatingStringsOfStringArr {

	//creating method to concat all strings from a string array
    public static StringBuffer concat(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String s : arr) {
            sb.append(s);
        }
        return sb;
    }

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of string array : ");
        int size = sc.nextInt();
        
        String[] arr = new String[size];
        //taking a string array as input
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + " string ");
            arr[i] = sc.next();   
        }

        //displaying result
        StringBuffer concatenated = concat(arr);
        System.out.println("Concatinated string : " +concatenated);
    }
}
