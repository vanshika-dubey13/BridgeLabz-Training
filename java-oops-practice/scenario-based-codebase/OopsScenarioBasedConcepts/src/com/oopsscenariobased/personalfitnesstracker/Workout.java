package com.oopsscenariobased.personalfitnesstracker;

abstract class Workout implements ITrackable {
	
	//attributes
    protected String type;
    protected int duration; 
    protected int caloriesBurned;
    protected boolean isActive;

    //
    protected abstract int calculateCalories();

    public void startWorkout() {
        isActive = true;
        System.out.println(type + " workout started.");
    }

    public void stopWorkout() {
        isActive = false;
        caloriesBurned = calculateCalories();
        System.out.println(type + " workout stopped.");
        System.out.println("Calories Burned: " + caloriesBurned);
    }

    
    protected int getCaloriesBurned() {
        return caloriesBurned;
    }
}

