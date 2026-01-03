package com.oopsscenariobased.smarthome;

//subclass		
public class AC extends Appliance {

	//constructor
    AC(int powerUsage) {
        super(powerUsage);
    }

    //overriding method of parent class
    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("AC started at set temperature");
    }

    //overriding method of parent class
    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("AC turned OFF");
    }
}
