package com.Qone01200712D;

import java.util.Scanner;

public class ArrayID {
    public static void main(String[] args) {
        Scanner save = new Scanner(System.in);
        int[] numb = new int[10];
        int sum = 0;
        double Average;


        System.out.println("Enter 10 numbers : ");
        for (int i = 0; i < numb.length; i++) {
            numb[i] = save.nextInt();
            save.nextLine();
            sum += numb[i];

        }
        Average = (double) sum / 10;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + Average);
        System.out.println("Reverse order ");
        System.out.print("[ ");
        for (int i = numb.length - 1; i >= 0; i--) {
            System.out.print(numb[i] + " ");
        }
        System.out.print("]");
    }
}
