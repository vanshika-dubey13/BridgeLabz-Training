package com.interfaces.markerinterfaces;

class Prototype implements Cloneable {
    //attribute
	int value;

	//constructor
    Prototype(int value) {
        this.value = value;
    }
    
    //cloning
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

//main class
public class CloningPrototypeObjectsMain {
    //main method
	public static void main(String[] args) throws Exception {
        Prototype original = new Prototype(100);
        Prototype copy = (Prototype) original.clone();
        
        //displaying results
        System.out.println("Original value: " + original.value);
        System.out.println("Cloned value: " + copy.value);
    }
}
