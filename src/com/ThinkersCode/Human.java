package com.ThinkersCode;

import java.util.Arrays;
import java.util.Scanner;

public class Human {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        Scanner sc = new Scanner(System.in);
        int numberOfStudent = in.nextInt();
        String[] name = new String[numberOfStudent];
        System.out.println("Enter the name's of students: ");
        for (int i = 0; i < name.length; i++) {
            System.out.print("Student No. " + (i + 1) + " : ");
            name[i] = sc.nextLine();
        }

        for (int i = 0; i < 80; i++) {
            System.out.print("=");
        }

        System.out.println();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the marks of each student in order as you entered their names: ");
        int[] marks = new int[numberOfStudent];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student mark No. " + (i + 1) + " : ");
            marks[i] = sc1.nextInt();
        }
        for (int i = 0; i < 80; i++) {
            System.out.print("=");
        }

        System.out.println();

        // This for loop will sort the marks in the array.
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks.length; j++) {
                if (marks[i] < marks[j]) {
                    int[] temp = new int[1];
                    temp[0] = marks[j];
                    marks[j] = marks[i];
                    marks[i] = temp[0];
                    System.out.println(Arrays.toString(marks));
                }
            }
        }
        for (int i = 0; i < 80; i++) {
            System.out.print("=");
        }
        System.out.println();

        System.out.println("Position\t\t\t\tMark");
        for (int counter = 0; counter < numberOfStudent; counter++) {
            //System.out.println((counter + 1) + "\t\t" + name[counter] + "\t\t\t\t" + marks[counter]);
            System.out.println((counter + 1) + "\t\t\t\t\t" + marks[counter]);
        }


    }
}