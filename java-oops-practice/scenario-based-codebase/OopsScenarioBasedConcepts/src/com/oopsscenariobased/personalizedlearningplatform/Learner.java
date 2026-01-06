package com.oopsscenariobased.personalizedlearningplatform;

//subclass
class Learner extends User implements ICertifiable {
	
	//attributes
	 private boolean fullTime;

	 //constructor
	 public Learner(String name, String email, int userId, boolean fullTime) {
	     super(name, email, userId);
	     this.fullTime = fullTime;
	 }

	//overriding interface method
	 @Override
	 public void generateCertificate() {
	     if (fullTime) {
	         System.out.println("Full-Time Course Certificate awarded to " + name);
	     } else {
	         System.out.println("Short Course Certificate awarded to " + name);
	     }
	 }
}