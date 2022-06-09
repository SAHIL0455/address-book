package com.company;

import java.util.Scanner;

public class AddressBook {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome the Address Book");
        Contact contact = addContact();
        System.out.println(contact);
    }

    private static Contact addContact() {
        Contact contact = new Contact();
        System.out.println("Enter the First Name");
        contact.setFirstName(scanner.next());
        System.out.println("Enter the Last Name");
        contact.setLastName(scanner.next());
        System.out.println("Enter the Address");
        contact.setAddress(scanner.next());
        System.out.println("Enter the City");
        contact.setCity(scanner.next());
        System.out.println("Enter the State");
        contact.setState(scanner.next());
        System.out.println("Enter the Zip");
        contact.setZip(scanner.nextInt());
        System.out.println("Enter the Phone Number");
        contact.setPhoneNumber(scanner.nextLong());
        System.out.println("Enter the Email ID");
        contact.setEmail(scanner.next());
        return contact;
    }
}
