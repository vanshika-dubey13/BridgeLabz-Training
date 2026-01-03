package com.oopsscenariobased.smarthome;

//subclass
public class Light extends Appliance {

    Light() {
    	// setting default power as 60
        super(60); 
    }

    //overriding method of interface
    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Light is on");
    }

    //overriding method of interface
    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Light is OFF");
    }
}
