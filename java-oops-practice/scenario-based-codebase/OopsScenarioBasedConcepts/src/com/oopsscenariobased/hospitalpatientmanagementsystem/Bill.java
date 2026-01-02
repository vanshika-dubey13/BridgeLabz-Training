package com.oopsscenariobased.hospitalpatientmanagementsystem;

//class for calculating bill
class Bill implements Payable {
	
	//attributes
    private double consultationFee;
    private double medicineFee;
    private double taxRate;

    //constructor
    public Bill(double consultationFee, double medicineFee, double taxRate) {
        this.consultationFee = consultationFee;
        this.medicineFee = medicineFee;
        this.taxRate = taxRate;
    }

    //overriding method of interface 
    @Override
    public double calculatePayment() {
        double total = consultationFee + medicineFee;
        double tax = total * taxRate / 100;
        return total + tax;
    }

    //displaying bill
    public void displayBill() {
        System.out.println("Total Payment: Rs. " + calculatePayment());
    }
}