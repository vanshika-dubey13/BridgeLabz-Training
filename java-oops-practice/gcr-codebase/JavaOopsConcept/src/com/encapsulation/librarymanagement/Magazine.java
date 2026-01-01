package com.encapsulation.librarymanagement;

//subclass
class Magazine extends LibraryItem implements Reservable {
	
	//attributes
    private boolean isAvailable = true;
    private String borrowerName;

    //constructors
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    //overriding method of parent class 
    @Override
    public int getLoanDuration() {
    	// 1 week
        return 7; 
    }

    //overriding method of parent class 
    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            this.borrowerName = borrowerName;
            isAvailable = false;
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine is already reserved by " + this.borrowerName);
        }
    }
    
    //overriding method of parent class 
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
