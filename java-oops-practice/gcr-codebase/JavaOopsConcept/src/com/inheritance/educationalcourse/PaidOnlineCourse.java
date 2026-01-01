package com.inheritance.educationalcourse;

//subclass
class PaidOnlineCourse extends OnlineCourse {
	
	//attributes
    double fee;
    double discount; // percentage

    //constructor
    PaidOnlineCourse(String courseName, int duration, String platform,
                     boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    //calculating fee
    double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }
}
