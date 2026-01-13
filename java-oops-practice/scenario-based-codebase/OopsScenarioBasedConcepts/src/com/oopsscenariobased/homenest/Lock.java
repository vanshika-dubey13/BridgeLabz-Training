package com.oopsscenariobased.homenest;

//subclass
public class Lock extends Device {
	
	//constructor
    public Lock(String id, double usage) {
        super(id, usage);
    }

    //overriding methods of interface
    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Door locked");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Door unlocked");
    }

    @Override
    public void reset() {
        System.out.println("Lock security reset.");
    }
}
