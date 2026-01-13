package com.oopsscenariobased.homenest;

//subclass
class Light extends Device {
	
	//constructor
    public Light(String id, double usage) {
        super(id, usage);
    }
    
    //overriding method of interface
    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Light turned ON");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Light turned OFF");
    }

    @Override
    public void reset() {
        System.out.println("Light brightness reset.");
    }
}
