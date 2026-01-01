package com.encapsulation.librarymanagement;

//subclass
class Book extends LibraryItem implements Reservable {
	
	//attributes
    private boolean isAvailable = true;
    private String borrowerName;

    //constructors
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    //overriding method of parent class 
    @Override
    public int getLoanDuration() {
    	// 3 weeks
        return 21; 
    }

  //overriding method of parent class 
    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            this.borrowerName = borrowerName;
            isAvailable = false;
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book is already reserved by " + this.borrowerName);
        }
    }

  //overriding method of parent class 
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}



