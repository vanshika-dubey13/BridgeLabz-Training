package com.oopsscenariobased.smartparkingsystem;

class ParkingSlot {
	
	//attributes
    private final int slotId;
    private boolean isOccupied;
    private final String vehicleTypeAllowed;

    //constructor
    ParkingSlot(int slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public void occupySlot() {
        isOccupied = true;
    }

    public void freeSlot() {
        isOccupied = false;
    }

    public String getVehicleTypeAllowed() {
        return vehicleTypeAllowed;
    }

    public int getSlotId() {
        return slotId;
    }
}

