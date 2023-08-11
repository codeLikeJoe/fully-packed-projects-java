package com.ajnetworks;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double hours;
        String name;
        System.out.print("Enter your name : ");
        name = in.nextLine();
        System.out.print("Enter Number of Hours Worked : ");
        hours = in.nextDouble();
        in.nextLine();

        System.out.println("Name\t:\t" + name);
        double yourSalary = payRole(hours);
        System.out.printf("Salary\t:\tGHs %.2f\n", yourSalary);
    }

    static double payRole(double hours) {
        double hourlyRate = 10;
        double salaryBeforeTax = hours * hourlyRate;
        double tax = salaryBeforeTax * 7.5 / 100;
        double salary = hours * hourlyRate - tax;
        if (hours >= 170) {
            double finalSalary = salary - (salary * 30 / 100);
            return finalSalary;
        } else {
            double salary1 = salary - (salary * 5 / 100);
            double finalSalary = salary1 - (salary1 * 30 / 100);
            return finalSalary;
        }
    }
}
