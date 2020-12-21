package com.paula;

public class BankAccount {

    // fields(instance variables)

    private int accountNum, phoneNum;
    private double balance;
    private String name, email;

    // constructor
    public BankAccount(int accountNum, int phoneNum, double balance, String name, String email){
        this.accountNum = accountNum;
        this.phoneNum = phoneNum;
        this.balance = balance;
        this.name = name;
        this.email = email;
    }
    // setters
    public void setAccountNum(int value) {
        this.accountNum = value;
    }

    public void setPhoneNum(int value) {
        this.phoneNum = value;
    }

    public void setBalance(double value) {
        this.balance = value;
    }

    public void setName(String value) {
        this.name = value;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    // getters
    public int getAccountNum() {
        return accountNum;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void deposit(double money) {
        this.balance += money;
        System.out.println("Thanks for depositing money. Your new balance is " + this.balance);
    }

    public void withdraw(double money) {
        if (money > this.balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            this.balance -= money;
            System.out.println("Thanks for withdrawal. Your new balance is " + this.balance);
        }
    }
}
