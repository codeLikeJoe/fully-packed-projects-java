package com.School;

import java.util.Scanner;

public class resultCal_B extends resultCal_A {
    public static void main(String[] args) {
        Scanner aj = new Scanner(System.in);

        System.out.println("RESULT CALCULATOR FOR SECOND SEMESTER");
        System.out.println("\tCOMPUTER SCIENCE DEPARTMENT");
        System.out.println("-------------------------------------");
        System.out.println("Please follow instructions carefully!!");
//        System.out.print("What semester is it(number)? ");
        setSem(2);

        if (getSem() >= 2) {
            double[] gpa = new double[getSem()];
//            System.out.println("Enter Previous CGPA");
            for (int i = 0; i < getSem() - 1; i++) {
                System.out.print("Enter Semester " + (i + 1) + " CGPA: ");
                gpa[i] = aj.nextDouble();
                aj.nextLine();

                totalGpa += gpa[i];
            }
        }
        System.out.println();
        System.out.println("Enter course codes, scores & credit Hours for each course.");
        System.out.println("************************************************************");

        double[] score = new double[numberOfCourses];
        int[] credits = new int[numberOfCourses];
        String[] courseCode = new String[numberOfCourses];
        String[] code = new String[numberOfCourses];
        String[] grade = new String[numberOfCourses];
        String[] courseName = new String[numberOfCourses];
        double[] point = new double[numberOfCourses];

        for (int i = 0; i < numberOfCourses; i++) {
            System.out.println("Course(" + (i + 1) + ")");
            System.out.print("Course Code: ");
            courseCode[i] = aj.nextLine().replaceAll("\\s", "");
            System.out.print("Score: ");
            score[i] = aj.nextDouble();
            System.out.print("Credit Hour(s): ");
            credits[i] = aj.nextInt();
            aj.nextLine();
            System.out.println("---------------------------------------------------");

            if (courseCode[i].equalsIgnoreCase(eee.replaceAll("\\s", ""))) {
                code[i] = eee;
                courseName[i] = "INTRODUCTORY ELECTRONICS";
            }
            if (courseCode[i].equalsIgnoreCase(sta.replaceAll("\\s", ""))) {
                code[i] = sta;
                courseName[i] = "STATISTICAL METHODS II";
            }
            if (courseCode[i].equalsIgnoreCase(comp.replaceAll("\\s", ""))) {
                code[i] = comp;
                courseName[i] = "FUNDAMENTALS OF COMPUTING II";
            }
            if (courseCode[i].equalsIgnoreCase(pro.replaceAll("\\s", ""))) {
                code[i] = pro;
                courseName[i] = "OBJECT ORIENTED SOFTWARE DEVELOPMENT WITH JAVA";
            }
            if (courseCode[i].equalsIgnoreCase(comS.replaceAll("\\s", ""))) {
                code[i] = comS;
                courseName[i] = "COMMUNICATION SKILLS";
            }
            if (courseCode[i].equalsIgnoreCase(hardW.replaceAll("\\s", ""))) {
                code[i] = hardW;
                courseName[i] = "COMPUTER HARDWARE";
            }
            if (courseCode[i].equalsIgnoreCase(dMath.replaceAll("\\s", ""))) {
                code[i] = dMath;
                courseName[i] = "DISCRETE MATHEMATICS FOR COMPUTER SCIENCE";
            }
            if (score[i] >= 85) {
                grade[i] = "A+";
                point[i] = 5.0 * credits[i];
            }
            if (score[i] >= 80 && score[i] <= 84) {
                grade[i] = "A";
                point[i] = 4.5 * credits[i];
            }
            if (score[i] >= 75 && score[i] <= 79) {
                grade[i] = "B+";
                point[i] = 4.0 * credits[i];
            }
            if (score[i] >= 70 && score[i] <= 74) {
                grade[i] = "B";
                point[i] = 3.5 * credits[i];
            }
            if (score[i] >= 65 && score[i] <= 69) {
                grade[i] = "C+";
                point[i] = 3.0 * credits[i];
            }
            if (score[i] >= 60 && score[i] <= 64) {
                grade[i] = "C";
                point[i] = 2.5 * credits[i];
            }
            if (score[i] >= 55 && score[i] <= 59) {
                grade[i] = "D+";
                point[i] = 2.0 * credits[i];
            }
            if (score[i] >= 50 && score[i] <= 54) {
                grade[i] = "D";
                point[i] = 1.5 * credits[i];
            }
            if (score[i] >= 0 && score[i] <= 49) {
                grade[i] = "F";
                point[i] = 0.0 * credits[i];
            }

            totalCredits += credits[i];
            totalPoints += point[i];
        }

        C_gpa = totalPoints / totalCredits;
        totalCgpa = (totalGpa + C_gpa) / getSem();

        System.out.println("\n\n\n\n");
        head();
        for (int i = 0; i < numberOfCourses; i++) {
            System.out.print(code[i] + "\t\t");
            if (courseName[i].length() == 28) {
                System.out.print(courseName[i] + "\t\t\t\t\t\t\t ");
            } else if ((courseName[i].length()) == 22 || (courseName[i].length() == 20)) {
                System.out.print(courseName[i] + "\t\t\t\t\t\t\t\t\t ");
            } else if (courseName[i].length() == 17) {
                System.out.print(courseName[i] + "\t\t\t\t\t\t\t\t\t\t ");
            } else if (courseName[i].length() == 41) {
                System.out.print(courseName[i] + "\t\t\t\t ");
            } else if (courseName[i].length() == 46) {
                System.out.print(courseName[i] + "\t\t\t ");
            } else {
                System.out.print(courseName[i] + "\t\t\t\t\t\t\t\t ");
            }
            System.out.print(credits[i] + "\t  ");
            System.out.print(Math.round(score[i]));
            System.out.print("\t" + grade[i] + "\t\t  ");
            System.out.printf("%.1f\n", point[i]);
        }
        System.out.println();
        sp();
        if (getSem() >= 2) {
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + totalCredits + "\t\t\t\t\t\t");
            System.out.printf("%.2f", totalPoints);
            System.out.print("\t");
            System.out.printf("%.2f\n", totalCgpa);
        } else {
            System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + totalCredits + "\t\t\t\t\t\t");
            System.out.printf("%.2f", totalPoints);
            System.out.print("\t");
            System.out.printf("%.2f\n", C_gpa);
        }
        sp();
        line();
    }
}
