package com.paula;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }


    public ArrayList<Contact> getContacts() {
        return myContacts;
    }

    public void printContacts(){
        System.out.println("Contact list");
        for(int i=0; i< this.myContacts.size(); i++){
            System.out.println((i+1) + ". " + this.myContacts.get(i).getName() + "->" + this.myContacts.get(i).getPhoneNumber());
        }
    }

    public boolean addContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact already exists");
            return false;
        }
        myContacts.add(contact);
        return true;
    }


    public boolean modifyContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if(position < 0){
            System.out.println(oldContact.getName() + ", was not found");
            return false;
        } else if(findContact(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getPhoneNumber() + " already exists.");
            return false;
        }
        this.myContacts.set(position, newContact);
        System.out.println(oldContact.getName() + " was replaces with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if(position < 0){
            System.out.println(contact.getName() + ", was not found");
            return false;
        }

        this.myContacts.remove(contact);
        System.out.println(contact.getName() + " was removed.");
        return true;
    }


    public String queryContact(Contact contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }

    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }


    private int findContact(String contactName){
        for(int i=0; i<this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

}
