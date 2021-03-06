package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class AddressBook {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Contact> addressBookList = new ArrayList<Contact>();

    public static void deleteContact() {
        System.out.println("Enter the name ");
        String name = scanner.next();
        for (int i = 0; i < addressBookList.size(); i++) {
            if (addressBookList.get(i).getFirstName().equals(name)) {
                addressBookList.remove(addressBookList.get(i));
            }
        }
        System.out.println(addressBookList);
        System.out.println("Successfully delete the contact");
    }

    public static void multipleContact(int numberOfContact) {
        for (int j = 0; j < numberOfContact; j++) {
            System.out.println("Add " + (j + 1) + " Person of details :");
            addContact();
        }
    }

    public static void addContact() {
        System.out.println("Enter the first name");
        String firstName = scanner.next();
        boolean Isduplicate = addressBookList.stream().anyMatch(person -> (person.getFirstName()).equals(firstName));
        if (Isduplicate) {
            System.out.println("all ready save the contact ");
            return;
        }
        Contact contact = new Contact();
        contact.setFirstName(firstName);
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
        addressBookList.add(contact);
        System.out.println(addressBookList);
        System.out.println("Successfully added new Contacts");
    }

    public static void editContact() {
        System.out.println("Enter the name to edit: ");
        String name = scanner.next();
        for (int i = 0; i < addressBookList.size(); i++) {
            if (addressBookList.get(i).getFirstName().equals(name)) {
                System.out.println("Edit the contact \n Select the Option \n1. First Name \n2. Last Name \n3. Address \n4. City \n5. State \n6. Zip \n7. Phone NUmber \n8. Email ID");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Enter the First Name");
                        addressBookList.get(i).setFirstName(scanner.next());
                        System.out.println("Now your First Name is : " + addressBookList.get(i).getFirstName());
                        break;
                    case 2:
                        System.out.println("Enter the Last Name");
                        addressBookList.get(i).setLastName(scanner.next());
                        System.out.println("Now your Last Name IS : " + addressBookList.get(i).getLastName());
                        break;
                    case 3:
                        System.out.println("Enter the Address");
                        addressBookList.get(i).setAddress(scanner.next());
                        System.out.println("Now Your Address is  : " + addressBookList.get(i).getAddress());
                        break;
                    case 4:
                        System.out.println("Enter the City");
                        addressBookList.get(i).setCity(scanner.next());
                        System.out.println("Now Your City is : " + addressBookList.get(i).getCity());
                        break;
                    case 5:
                        System.out.println("Enter the State");
                        addressBookList.get(i).setState(scanner.next());
                        System.out.println("Now Your State is : " + addressBookList.get(i).getState());
                        break;
                    case 6:
                        System.out.println("Enter the Zip ");
                        addressBookList.get(i).setZip(scanner.nextInt());
                        System.out.println("Now Your Zip is : " + addressBookList.get(i).getZip());
                        break;
                    case 7:
                        System.out.println("Enter the Phone Number");
                        addressBookList.get(i).setPhoneNumber(scanner.nextLong());
                        System.out.println("Now Your Phone NUmber : " + addressBookList.get(i).getPhoneNumber());
                        break;
                    case 8:
                        System.out.println("Enter the Email ID");
                        addressBookList.get(i).setEmail(scanner.next());
                        System.out.println("Now Your Email Id : " + addressBookList.get(i).getEmail());
                    default:
                        System.out.println("Enter the Valid Number");
                }
            }
            System.out.println("edited list");
            System.out.println(addressBookList);
        }
    }

    public void searchContact() {
        System.out.println("Enter the name of city or state");
        String cityOrState = scanner.next();
        for (Contact contact : addressBookList) {
            if (contact.getCity().equals(cityOrState) && contact.getState().equals(cityOrState)) {
                System.out.println(contact);
            } else {
                System.out.println("Not found in the address book");
            }
        }
    }

    public void countCityOrPerson() {
        System.out.println("Enter the name of City or State");
        String cityOrState = scanner.next();
        AtomicInteger count = new AtomicInteger(0);
        Stream<Contact> stream = addressBookList.stream();
        stream.forEach(i ->
                {
                    if (i.getCity().equals(cityOrState) && i.getState().equals(cityOrState)) {
                        count.getAndIncrement();
                    }
                }
        );
    }

    public void sort() {
        System.out.println("Sorting the address Book in the alphabetically");
        Stream<Contact> stream = addressBookList.stream();
        stream.sorted(Comparator.comparing(Contact::getFirstName)).forEach(System.out::println);
    }

    public void sortingByCity() {
        boolean condition = true;
        while (condition) {
            System.out.println("choose the option\n1 sorting by city\n2 sorting by state\n3 sorting by zip\n4 exit");
            int number = scanner.nextInt();
            Stream<Contact> stream = addressBookList.stream();
            switch (number) {
                case 1:
                    stream.sorted(Comparator.comparing(Contact::getCity)).forEach(System.out::println);
                    break;
                case 2:
                    stream.sorted(Comparator.comparing(Contact::getState)).forEach(System.out::println);
                    break;
                case 3:
                    stream.sorted(Comparator.comparing(Contact::getZip)).forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("exiting...");
                    condition = false;
                default:
                    System.out.println("Enter the valid number");
                    break;
            }
        }
    }
}
