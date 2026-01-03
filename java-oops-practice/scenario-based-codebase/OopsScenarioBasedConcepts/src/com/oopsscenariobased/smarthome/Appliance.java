package com.oopsscenariobased.smarthome;

abstract class Appliance implements Controllable {
	
	//attributes
    private boolean isOn;
   // in watts
    private int powerUsage; 

    //constructor
    Appliance(int powerUsage) {
        this.powerUsage = powerUsage;
        this.isOn = false;
    }

    protected void setOn(boolean status) {
        isOn = status;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getPowerUsage() {
        return powerUsage;
    }
}
