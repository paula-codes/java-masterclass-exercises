package com.paula;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        //double price = hamburger.allItems();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("letuce", 1.00);
        System.out.println("Total price = " + hamburger.allItems());
    }
}
