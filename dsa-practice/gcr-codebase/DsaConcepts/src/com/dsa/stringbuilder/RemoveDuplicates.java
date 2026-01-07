package com.dsa.stringbuilder;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {

	public static String removeDuplicateFromStr(String input) {
		HashSet<Character> seen = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for(char c: input.toCharArray()) {
			if(!seen.contains(c)) {
				seen.add(c);
				sb.append(c);
			}
		}return sb.toString();
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.next();
		String result = removeDuplicateFromStr(str);
		System.out.println("\nOriginal string : " + str);
		System.out.println("\nString after removing duplicates : " + result);
		}

}
