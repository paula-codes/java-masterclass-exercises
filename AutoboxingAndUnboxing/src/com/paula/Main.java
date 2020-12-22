package com.paula;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Tesco Bank");
        bank.addBranch("Manchester");
        bank.addCustomer("Manchester", "Tom", 50.10);
        bank.addCustomer("Manchester", "Mike", 62.05);

        bank.addBranch("London");
        bank.addCustomer("London", "Ted", 110.00);

        bank.addCustomerTransactions("Manchester", "Mike", 43.44);
        bank.addCustomerTransactions("Manchester", "Tom", 12.19);

        bank.listCustomers("Manchester", true);
        bank.listCustomers("London", true);

    }
}
