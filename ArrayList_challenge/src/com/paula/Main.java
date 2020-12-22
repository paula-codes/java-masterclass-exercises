package com.paula;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("05465 546");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: " );
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
            }
        }

    }

    private static void startPhone(){
        System.out.println("Starting phone...");
    }

    public static void printInstructions(){
        System.out.println("\n Press ");
        System.out.println("\t 0 - to print a list of choices. ");
        System.out.println("\t 1 - to print the list of contacts ");
        System.out.println("\t 2 - to add a contact to the list. ");
        System.out.println("\t 3 - to modify a contact from the list. ");
        System.out.println("\t 4 - to remove a contact from the list. ");
        System.out.println("\t 5 - to search for a contact in the list. ");
        System.out.println("\t 6 - to shutdown. ");
    }

    private static void addContact(){
        System.out.print("Please enter the new contact name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter the new contact number: ");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if(mobilePhone.addContact(newContact)) {
            System.out.println("New contact added: " + name + ", phone= " + phoneNumber);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }


    private static void modifyContact(){
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number: ");
        String newPhone = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhone);

        if(mobilePhone.modifyContact(existingContact, newContact)){
            System.out.println("Successfully updated");
        } else {
            System.out.println("Error updating the contact");
        }
    }

    private static void removeContact(){
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContact)){
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting the contact");
        }
    }


    private static void searchForContact(){
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContact.getName() + " and phone number: " + existingContact.getPhoneNumber());
    }


}
