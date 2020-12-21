package com.paula;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    private static void readInteger(int count) {
        System.out.println("Enter count:");
        count = scanner.nextInt();
        scanner.nextLine();
    }

    // getting integers(the input)
    private static int[] readElements(int capacity){
        int[] array = new int[capacity];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++){
            int value = array[i];

            if(value < min) {
                min = value;
            }
        }
        return min;
    }

    
}