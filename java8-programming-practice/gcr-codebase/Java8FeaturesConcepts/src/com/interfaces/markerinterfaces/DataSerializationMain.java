package com.interfaces.markerinterfaces;

import java.io.Serializable;

class UserData implements Serializable {
    //attributes
	String name;

	//constructor
    UserData(String name) {
        this.name = name;
    }
}

//main class
public class DataSerializationMain {
    //main method 
	public static void main(String[] args) {
        UserData user = new UserData("Alice");

        if (user instanceof Serializable) {
            System.out.println("Object marked for backup (Serializable).");
        }
        else {
            System.out.println("Object not eligible for backup.");
        }
    }
}

