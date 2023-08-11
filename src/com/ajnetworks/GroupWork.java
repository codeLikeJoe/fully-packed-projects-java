package com.ajnetworks;

import java.util.Scanner;

public class GroupWork {
    public static void me(String name, int date) {
        int age = 2021 - date;
        System.out.println("Your name is " + name + ", you are " + age + " years old");
    }

    public static void main(String[] args) {
        Scanner aj = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = aj.nextLine();

        System.out.println("In what year were you Born?");
        int userBirthDate = aj.nextInt();

        me(userName, userBirthDate);
    }
}
