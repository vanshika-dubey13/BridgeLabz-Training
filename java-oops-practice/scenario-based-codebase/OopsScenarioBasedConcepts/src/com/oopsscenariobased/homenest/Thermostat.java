package com.oopsscenariobased.homenest;

//subclass
public class Thermostat extends Device {
	
	//constructor
    public Thermostat(String id, double usage) {
        super(id, usage);
    }

    //overriding method of interface
    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Thermostat activated");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat turned OFF");
    }

    @Override
    public void reset() {
    	System.out.println("Thermostat is reset");
    }

}
