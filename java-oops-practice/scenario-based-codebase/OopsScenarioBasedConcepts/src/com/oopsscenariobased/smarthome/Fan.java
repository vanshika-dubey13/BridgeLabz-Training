package com.oopsscenariobased.smarthome;

//subclass
public class Fan extends Appliance {

	//constructor
    Fan(int powerUsage) {
        super(powerUsage);
    }

    //overriding method of interface
    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Fan is on");
    }

  //overriding method of interface
    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Fan is off");
    }
}
