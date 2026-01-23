package com.oopsscenariobased.addressbooksystem;

import java.util.*;

class AddressBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    // Add Contact with duplicate validation
    public void addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(contact.getFullName())) {
                System.out.println("Duplicate contact not allowed!");
                return;
            }
        }
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    // Edit Contact
    public void editContact(String name, Scanner sc) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(name)) {
                System.out.print("Enter new phone: ");
                c.setPhone(sc.nextLine());
                System.out.print("Enter new email: ");
                c.setEmail(sc.nextLine());
                System.out.println("Contact updated.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Delete Contact
    public void deleteContact(String name) {
        Iterator<Contact> it = contacts.iterator();
        while (it.hasNext()) {
            Contact c = it.next();
            if (c.getFullName().equalsIgnoreCase(name)) {
                it.remove();
                System.out.println("Contact deleted.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Search by City or State
    public void searchByLocation(String value) {
        boolean found = false;
        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(value) ||
                c.getAddress().getState().equalsIgnoreCase(value)) {
                System.out.println(c);
                found = true;
            }
        }
        if (!found) System.out.println("No contacts found.");
    }

    // Display Sorted Contacts
    public void displayAll() {
        contacts.sort(Comparator.comparing(Contact::getFullName));
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}

