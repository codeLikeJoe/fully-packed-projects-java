package com.QThreeID;

import java.util.Scanner;

public class MelcomID {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        StoreItem store = new StoreItem();
        System.out.println("Enter 1 to continue or 0 to exit");
        int choice = i.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    store.ask();
                    store.createItem();
                    store.display();
                    break;
                default:
                    System.out.println("Invalid Entry...");
                    System.out.println("Try Again!");
                    break;
            }
            System.out.println("---------------------------------");
            System.out.println("Enter 1 to continue or 0 to exit");
            choice = i.nextInt();
        }
        System.out.println("Thanks for your service!!");
    }
}