package com.interfaces;

public class SmartDeviceControlMain {
    public static void main(String[] args) {

        SmarrtDeviceControl light = new Light();
        SmarrtDeviceControl ac = new AC();
        SmarrtDeviceControl tv = new TV();

        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}
