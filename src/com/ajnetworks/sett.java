package com.ajnetworks;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class sett {
    Scanner scan = new Scanner(System.in);
    Date date = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
    String cashier, waiter;

    void ask() {
        F();
        System.out.println();
        System.out.print("CASHIER\t\t: ");
        cashier = scan.nextLine();
        System.out.print("WAITER\t\t: ");
        waiter = scan.nextLine();
    }

    void give() {
        System.out.print("CASHIER\t\t:\tAJ\n");
        System.out.print("WAITER\t\t:\tESTHER\n");
        System.out.println();
        System.out.print("ORDER DATE\t:\t");
        System.out.print(dateFormat.format(date));
        System.out.println();
    }

    void F() {
        for (int i = 0; i < 15; i++) {
            System.out.print("----");
        }
    }

    void adr() {
        System.out.println("TEL\t\t\t\t\t\t\t:\t0592668205 / 0509966109");
        System.out.println("Address\t\t\t\t\t\t:\t66,RINGROAD CENTRAL, ACCRA\n");
        System.out.println("VAT No.\t\t\t\t\t\t:\tC0009375112");
    }

    void d() {
        for (int i = 0; i < 9; i++) {
            System.out.print("***");
        }
    }
//    package questions;
//
//import java.util.Scanner;

//    public class Q2 {
//        public  static void compute(double hoursWorked){
//            double socialSecurity,tax,unionDues,dependentAssurance,grossPay,tax1;
//            if (hoursWorked == 40){
//                grossPay = 30;
//                socialSecurity = grossPay - ((6/100) * grossPay);
//                tax = ((7/100) * grossPay);
//                tax1 = grossPay-tax;
//                unionDues = grossPay - ((3/100) * grossPay);
//                dependentAssurance = grossPay - ((3/100) * grossPay);
//                System.out.println("Weekly wage: "+grossPay);
//                System.out.println("Social Security: "+socialSecurity);
//                System.out.println("Tax: "+tax);
//                System.out.println("Union Dues: "+unionDues);
//                System.out.println("Union : "+tax1);
//                System.out.println("Dependent Assurance: "+dependentAssurance);
//            }
//            else if (hoursWorked > 40 || hoursWorked <= 60){
//                grossPay = (1+0.5*30) + 30;
//                socialSecurity = grossPay - ((6/100) * grossPay);
//                tax = grossPay - ((7/100) * grossPay);
//                unionDues = grossPay - ((3/100) * grossPay);
//                dependentAssurance = grossPay - ((3/100) * grossPay);
//                System.out.println("Weekly wage: "+grossPay);
//                System.out.println("Social Security: "+socialSecurity);
//                System.out.println("Tax: "+tax);
//                System.out.println("Union Dues: "+unionDues);
//                System.out.println("Dependent Assurance: "+dependentAssurance);
//            }
//        }
//        public static void main(String[] args) {
//            System.out.print("Enter number of hours worked: ");
//            Scanner scanner = new Scanner(System.in);
//            double hoursWorked = scanner.nextDouble();
//
//            compute(hoursWorked);
//        }
//    }

}
