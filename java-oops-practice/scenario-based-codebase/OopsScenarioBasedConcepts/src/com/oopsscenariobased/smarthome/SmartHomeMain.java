package com.oopsscenariobased.smarthome;

//main method
public class SmartHomeMain {
    public static void main(String[] args) {

    	//creating objects of different appliances
        Appliance light = new Light();
        Appliance fan = new Fan(90);
        Appliance ac = new AC(1500);

        UserController controller = new UserController();

        //displaying details
        controller.controlDevice(light, true);
        controller.controlDevice(ac, true);
        controller.controlDevice(fan, true);
        controller.compareEnergy(light, ac);
        controller.controlDevice(fan, false);
        controller.controlDevice(ac, false);
    }
}
