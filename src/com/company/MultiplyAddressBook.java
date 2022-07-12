package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MultiplyAddressBook {
    public static Map<String, AddressBook> mapAddressBook = new HashMap<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Multiply Address Book");
        boolean condition = true;
        while (condition) {
            System.out.println("choose options \n1 : Add New AddressBook System \n2 : Add AddressBook System Contacts\n3 : Edit AddressBook System Contacts\n4 : Delete AddressBook System Contact\n5 : Add AddressBook System multiple contacts\n6 :  Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addAddressBook();
                    break;
                case 2:
                    addAddressBookContact();
                    break;
                case 3:
                    editAddressBookContact();
                    break;
                case 4:
                    deleteAddressBookContact();
                    break;
                case 5:
                    addMultipleContactsToAddressBook();
                    break;
                case 7:
                    condition = false;
                    System.out.println("Exiting the loop ");
                case 6:
                    searchPersonInMultiplyAddressBook();
                default:
                    System.out.println(mapAddressBook);
                    System.out.println("Invalid Number. Please try again");
            }
        }
    }

    private static void searchPersonInMultiplyAddressBook() {
        System.out.println("Enter the Name of address Book");
        String bookName = scanner.next();
        AddressBook address = mapAddressBook.get(bookName);
        AddressBook addressBook = new AddressBook();
        if (address == null) {
            System.out.println("No book found in address");
        } else {
            addressBook.searchContact();
        }
    }

    private static void addMultipleContactsToAddressBook() {
        System.out.println("Enter the Name of address Book");
        String bookName = scanner.next();
        AddressBook address = mapAddressBook.get(bookName);
        AddressBook addressBook = new AddressBook();
        if (address == null) {
            System.out.println("No book found in address");
        } else {
            System.out.println("Enter the Number of contact");
            int number = scanner.nextInt();
            addressBook.multipleContact(number);

        }
    }

    private static void deleteAddressBookContact() {
        System.out.println("Enter the Name of address Book");
        String bookName = scanner.next();
        AddressBook address = mapAddressBook.get(bookName);
        AddressBook addressBook = new AddressBook();
        if (address == null) {
            System.out.println("No book found in address");
        } else {
            addressBook.deleteContact();
        }
    }

    private static void editAddressBookContact() {
        System.out.println("Enter the Name of address Book");
        String bookName = scanner.next();
        AddressBook address = mapAddressBook.get(bookName);
        AddressBook addressBook = new AddressBook();
        if (address == null) {
            System.out.println("No book found in address");
        } else {
            addressBook.editContact();
        }
    }

    private static void addAddressBookContact() {
        System.out.println("Enter the Name of address Book");
        String bookName = scanner.next();
        AddressBook address = mapAddressBook.get(bookName);
        AddressBook addressBook = new AddressBook();
        if (address == null) {
            System.out.println("No book found in address");
        } else {
            addressBook.addContact();
        }
    }

    private static void addAddressBook() {
        System.out.println("Enter the Name of address Book");
        String bookName = scanner.next();
        AddressBook address = mapAddressBook.get(bookName);
        if (address == null) {
            AddressBook addressBook = new AddressBook();
            mapAddressBook.put(bookName, addressBook);
            System.out.println(mapAddressBook.entrySet());
            System.out.println("SuccessFully added New AddressBook");
        } else {
            System.out.println("AddressBook with this name already exists");
        }
    }
}
