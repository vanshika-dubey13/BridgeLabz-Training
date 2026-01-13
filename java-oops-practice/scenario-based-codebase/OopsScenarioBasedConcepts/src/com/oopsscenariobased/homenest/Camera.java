package com.oopsscenariobased.homenest;

//subclass
class Camera extends Device {
	
	//constructor
    public Camera(String id, double usage) {
        super(id, usage);
    }

    //overriding method of interface
    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Camera recording started");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Camera turned OFF");
    }

    @Override
    public void reset() {
        System.out.println("Camera recalibrated.");
    }
}
