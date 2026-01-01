package com.encapsulation.librarymanagement;

//creating interface Reservable
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
