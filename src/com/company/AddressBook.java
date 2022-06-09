package com.company;

import java.util.Scanner;

public class AddressBook {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome the Address Book");
        Contact contact = addContact();
        System.out.println(contact);
        Contact editContact = editContact(contact);
        System.out.println(editContact);
        Contact deleteContact = deleteContact(contact);
        System.out.println(deleteContact);
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

    private static Contact editContact(Contact contact) {
        System.out.println("Edit the contact \n Select the Option \n1. First Name \n2. Last Name \n3. Address \n4. City \n5. State \n6. Zip \n7. Phone NUmber \n8. Email ID");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter the First Name");
                contact.setFirstName(scanner.next());
                System.out.println("Now your First Name is : " + contact.getFirstName());
                break;
            case 2:
                System.out.println("Enter the Last Name");
                contact.setLastName(scanner.next());
                System.out.println("Now your Last Name IS : " + contact.getLastName());
                break;
            case 3:
                System.out.println("Enter the Address");
                contact.setAddress(scanner.next());
                System.out.println("Now Your Address is  : " + contact.getAddress());
                break;
            case 4:
                System.out.println("Enter the City");
                contact.setCity(scanner.next());
                System.out.println("Now Your City is : " + contact.getCity());
                break;
            case 5:
                System.out.println("Enter the State");
                contact.setState(scanner.next());
                System.out.println("Now Your State is : " + contact.getState());
                break;
            case 6:
                System.out.println("Enter the Zip ");
                contact.setZip(scanner.nextInt());
                System.out.println("Now Your Zip is : " + contact.getZip());
                break;
            case 7:
                System.out.println("Enter the Phone Number");
                contact.setPhoneNumber(scanner.nextLong());
                System.out.println("Now Your Phone NUmber : " + contact.getPhoneNumber());
                break;
            case 8:
                System.out.println("Enter the Email ID");
                contact.setEmail(scanner.next());
                System.out.println("Now Your Email Id : " + contact.getEmail());
            default:
                System.out.println("Enter the Valid Number");
        }
        return contact;
    }
    private static Contact deleteContact(Contact contact) {
        System.out.println("delete the contact \n Select the Option \n1. First Name \n2. Last Name \n3. Address \n4. City \n5. State \n6. Zip \n7. Phone NUmber \n8. Email ID");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("First Name is Deleted");
                contact.setFirstName(null);
                System.out.println("Now your First Name is : " + contact.getFirstName());
                break;
            case 2:
                System.out.println("Last Name is Deleted");
                contact.setLastName(null);
                System.out.println("Now your Last Name IS : " + contact.getLastName());
                break;
            case 3:
                System.out.println("Address is Deleted");
                contact.setAddress(null);
                System.out.println("Now Your Address is  : " + contact.getAddress());
                break;
            case 4:
                System.out.println("City is Deleted");
                contact.setCity(null);
                System.out.println("Now Your City is : " + contact.getCity());
                break;
            case 5:
                System.out.println("State is Deleted");
                contact.setState(null);
                System.out.println("Now Your State is : " + contact.getState());
                break;
            case 6:
                System.out.println("Zip is Deleted");
                contact.setZip(null);
                System.out.println("Now Your Zip is : " + contact.getZip());
                break;
            case 7:
                System.out.println("Phone Number is Deleted");
                contact.setPhoneNumber(null);
                System.out.println("Now Your Phone Number : " + contact.getPhoneNumber());
                break;
            case 8:
                System.out.println("Email ID is Deleted");
                contact.setEmail(null);
                System.out.println("Now Your Email Id : " + contact.getEmail());
            default:
                System.out.println("Enter the Valid Number");
        }
        return contact;
    }
}
