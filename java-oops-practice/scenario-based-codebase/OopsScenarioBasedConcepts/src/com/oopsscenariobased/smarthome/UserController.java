package com.oopsscenariobased.smarthome;

//superclass
class UserController {
	
    public void controlDevice(Controllable device, boolean turnOn) {
        if (turnOn) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }

    public void compareEnergy(Appliance a1, Appliance a2) {
        if (a1.getPowerUsage() > a2.getPowerUsage()) {
            System.out.println("First appliance consumes more energy");
        } else if (a1.getPowerUsage() < a2.getPowerUsage()) {
            System.out.println("Second appliance consumes more energy");
        } else {
            System.out.println("Both appliances consume equal energy");
        }
    }
}
