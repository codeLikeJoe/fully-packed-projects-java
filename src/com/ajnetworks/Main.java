package com.ajnetworks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    String n;
    int a;

    public Main(String name, int age) {
        this.n = name;
        this.a = age;

        System.out.println("Your name is " + name + ", you are " + age + " years old.");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String Name = in.nextLine();
        System.out.print("Enter your age: ");
        int Age = in.nextInt();

        Main aj = new Main(Name, Age);
    }
}