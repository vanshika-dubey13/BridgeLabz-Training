package com.collections.exceptions;

public class ExceptionPropagation {

    static void method1() {
    	// ArithmeticException
        int result = 10 / 0;   
    }

    static void method2() {
    	// propagating exception
    	method1();
    }
                   

    public static void main(String[] args) {

        try {
        	//exception reaches main method
            method2();       
        }
        catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}

