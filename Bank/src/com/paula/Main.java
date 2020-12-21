package com.paula;

public class Main {

    public static void main(String[] args) {
	    BankAccount bank = new BankAccount(12345, 191328300, 1525.25, "Tim", "tim@tim.com" );

        System.out.println("Name= " + bank.getName());
        System.out.println("Email= " + bank.getEmail());
        System.out.println("Phone= " + bank.getPhoneNum());
        System.out.println("Account No= " + bank.getAccountNum());
        System.out.println("Current balance= " + bank.getBalance());

        bank.deposit(200);
        bank.withdraw(200000);

//        VipPerson person1 = new VipPerson();
//        System.out.println(person1.getName());
//
//        VipPerson person2 = new VipPerson("Bob", 25000.00);
//        System.out.println(person2.getName());
//
//        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@tim.com");
//        System.out.println(person3.getName());

    }
}
