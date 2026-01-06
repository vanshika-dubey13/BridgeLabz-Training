package com.oopsscenariobased.personalfitnesstracker;

public class StrengthWorkout extends Workout{
	//attributes
	private int duration;
	private String type;

	//constructor
	public  StrengthWorkout(int duration) {
		this.type = "Strength";
		this.duration = duration;
	}

	//overriding method of parent class
	@Override
	protected int calculateCalories() {
		return duration * 6;
	}
}
