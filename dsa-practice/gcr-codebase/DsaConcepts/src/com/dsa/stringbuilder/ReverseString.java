package com.dsa.stringbuilder;

public class ReverseString {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		System.out.println("String before reversing : " + sb);
		sb.reverse(); 
		System.out.println("String after reversing : "+sb);
	}
}
