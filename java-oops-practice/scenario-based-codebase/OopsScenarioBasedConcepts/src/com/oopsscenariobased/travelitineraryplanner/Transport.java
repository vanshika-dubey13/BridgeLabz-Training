package com.oopsscenariobased.travelitineraryplanner;

//Service Classes (Encapsulation)
public class Transport {
	
	//attributes
	private double cost;

	//constructor
	Transport(double cost) {
		this.cost = cost;
	}

	double getCost() {
		return cost;
	}
}