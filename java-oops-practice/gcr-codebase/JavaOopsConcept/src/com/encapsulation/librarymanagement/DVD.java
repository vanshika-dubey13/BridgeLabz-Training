package com.encapsulation.librarymanagement;

//subclass
class DVD extends LibraryItem implements Reservable {

	//attributes
	private boolean isAvailable = true;
    private String borrowerName;

    //constructor
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    //overriding method of parent class 
    @Override
    public int getLoanDuration() {
    	// 2 weeks
        return 14; 
    }

    //overriding method of parent class 
    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            this.borrowerName = borrowerName;
            isAvailable = false;
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD is already reserved by " + this.borrowerName);
        }
    }

    //overriding method of parent class 
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
