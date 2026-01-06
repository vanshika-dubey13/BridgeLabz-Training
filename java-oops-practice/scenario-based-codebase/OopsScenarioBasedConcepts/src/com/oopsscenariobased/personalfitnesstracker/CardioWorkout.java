package com.oopsscenariobased.personalfitnesstracker;

public class CardioWorkout extends Workout {

	//constructor
    public CardioWorkout(int duration) {
        this.type = "Cardio";
        this.duration = duration;
    }

    //overriding method of parent class
    @Override
    protected int calculateCalories() {
        return duration * 8; 
    }
}

