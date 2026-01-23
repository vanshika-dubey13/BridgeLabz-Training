package com.oopsscenariobased.addressbooksystem;

import java.util.Scanner;

public class AddressBookAppMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook book = new AddressBook();

        while (true) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search by City/State");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("First Name: ");
                    String fn = sc.nextLine();
                    System.out.print("Last Name: ");
                    String ln = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("City: ");
                    String city = sc.nextLine();
                    System.out.print("State: ");
                    String state = sc.nextLine();
                    System.out.print("Zip: ");
                    String zip = sc.nextLine();

                    Address addr = new Address(city, state, zip);
                    Contact contact = new Contact(fn, ln, phone, email, addr);
                    book.addContact(contact);
                    break;

                case 2:
                    System.out.print("Enter full name to edit: ");
                    book.editContact(sc.nextLine(), sc);
                    break;

                case 3:
                    System.out.print("Enter full name to delete: ");
                    book.deleteContact(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Enter city or state: ");
                    book.searchByLocation(sc.nextLine());
                    break;

                case 5:
                    book.displayAll();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
