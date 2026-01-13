package com.oopsscenariobased.homenest;

//superclass
abstract class Device implements IControllable {

	//attributes
    private String deviceId;
    private boolean status;
    protected double energyUsage;
    private String firmwareLog;

    //constructor
    public Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        this.firmwareLog = "Initial firmware installed";
    }

    // Encapsulation
    public boolean getStatus() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    public String getDeviceId() {
        return deviceId;
    }

    //method to calculate energy usage
    public double calculateMonthlyEnergy(int hoursPerDay) {
        return energyUsage * hoursPerDay * 30;
    }

    //method to secure updates in firmware
    protected void updateFirmware(String log) {
        firmwareLog = log;
    }

    protected String getFirmWareLog() {
    	return firmwareLog;
    }
}
