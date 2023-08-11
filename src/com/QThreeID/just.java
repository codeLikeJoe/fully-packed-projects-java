package com.QThreeID;

import javax.swing.*;
import java.util.Scanner;

public class just {
    public static void main(String[] args) {
        Scanner aj = new Scanner(System.in);
        int choice;
        System.out.println("Enter 1 to continue or 0 to exit");
        choice = aj.nextInt();

        String[] name = new String[2];
        double[] age = new double[2];

        while (choice != 0) {
            switch (choice) {
                case 1:
                    for (int i = 0; i < 1; i++) {
                        System.out.print("Enter your name: ");
                        name[i] = aj.nextLine();
                        aj.nextLine();
//                        System.out.print("Your age: ");
//                        age[i] = aj.nextDouble();
                        aj.nextLine();
                    }
                    break;

                default:
                    System.out.println("Invalid Entry...");
                    System.out.println("Try Again!");
            }
            System.out.println("---------------------------------");
            System.out.println("Enter 1 to continue or 0 to exit");
            choice = aj.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            System.out.print(name[i]);
        }
        System.out.println("Thanks");
    }
}
