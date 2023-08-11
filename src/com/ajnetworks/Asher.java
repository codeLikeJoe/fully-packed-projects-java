package com.ajnetworks;

import java.util.Scanner;

public class Asher {
    static String country;
    static int age;

    static void Before() {
        System.out.println("Fill in the form");
        System.out.println("---------------------");
    }

    static void ask() {
        Scanner in = new Scanner(System.in);
        System.out.print("Country of origin : ");
        country = in.nextLine();

        System.out.print("Age : ");
        age = in.nextInt();
    }

    static void condition() {
        if (age >= 18 && country.equalsIgnoreCase("Ghana")) {
            System.out.println("You can vote...");
        } else {
            System.out.println("You are not eligible!");
        }
    }

    static void printAll() {
        Before();
        ask();
        condition();
    }

    public static void main(String[] args) {
        printAll();
    }
}