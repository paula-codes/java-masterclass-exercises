package com.paula;

import java.util.Scanner;

public class Account {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while (count < 11) {
            System.out.println("Enter a number #" + count);

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {

                int number = scanner.nextInt();
                scanner.nextLine();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid value");
                break;
            }
        }

        scanner.close();
        System.out.println("the sum is: " + sum);
    }
}
