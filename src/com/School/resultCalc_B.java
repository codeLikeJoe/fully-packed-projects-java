package com.School;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class resultCalc_B {
    public static void main(String[] args) {
        Scanner aj = new Scanner(System.in);
        String EEE = "EEE 110";
        String cps = "CPS 110";
        String name1 = "STATISTICAL METHODS II";
        String name2 = "OBJECT ORIENTED SOFTWARE DEVELOPMENT WITH JAVA";
        String name3 = "FUNDAMENTALS OF COMPUTING II";
        String name4 = "INTRODUCTORY ELECTRONICS";
        String name5 = "COMMUNICATION SKILLS";
        String name6 = "COMPUTER HARDWARE";
        String name7 = "DISCRETE MATHEMATICS FOR COMPUTER SCIENCE";

        System.out.println(name1.length());
        System.out.println(name2.length());
        System.out.println(name3.length());
        System.out.println(name4.length());
        System.out.println(name5.length());
        System.out.println(name6.length());
        System.out.println(name7.length());
//        String[] code = new String[2];
//        double[] score = new double[2];
//        for(int i = 0;i < 1;i++){
//            System.out.print("code: ");
//            code[i] = aj.nextLine().replaceAll("\\s","");
//            System.out.print("score: ");
//            score[i] = aj.nextDouble();
//            if(code[i].equalsIgnoreCase(EEE.replaceAll("\\s",""))){
//
//            }
//        }
//        for(int i = 0;i < 1;i++){
//
//        }
//        System.out.println(EEE.replaceAll(""," "));

//        System.out.println("Maths");
//        System.out.print("Scores: ");
//        score1 = aj.nextDouble();
//        System.out.print("Credit Hour(s): ");
//        creditHour1 = aj.nextDouble();
//        if(score1 >=85 && score1 <= 100){
//            grade1 = "A+";
//            point1 = 5.0 * creditHour1;
//        }
//        if(score1 >=80 && score1 <= 84){
//            grade1 = "A";
//            point1 = 4.5 * creditHour1;
//        }
//        if(score1 >=75 && score1 <= 79){
//            grade1 = "B+";
//            point1 = 4.0 * creditHour1;
//        }
//        if(score1 >=70 && score1 <= 74){
//            grade1 = "B";
//            point1 = 3.5 * creditHour1;
//        }
//        if(score1 >=65 && score1 <= 69){
//            grade1 = "C+";
//            point1 = 3.0 * creditHour1;
//        }
//        if(score1 >=60 && score1 <= 64){
//            grade1 = "C";
//            point1 = 2.5 * creditHour1;
//        }
//        if(score1 >=55 && score1 <= 59){
//            grade1 = "D+";
//            point1 = 2.0 * creditHour1;
//        }
//        if(score1 >=50 && score1 <= 54){
//            grade1 = "D";
//            point1 = 1.5 * creditHour1;
//        }
//        if(score1 >=0 && score1 <= 49){
//            grade1 = "F";
//            point1 = 0.0 * creditHour1;
//        }
//        System.out.println("---------------------------------------------------");
//
//        System.out.println("Maths");
//        System.out.print("Scores: ");
//        score2 = aj.nextDouble();
//        System.out.print("Credit Hour(s): ");
//        creditHour2 = aj.nextDouble();
//        if(score2 >=85 && score2 <= 100){
//            grade2 = "A+";
//            point2 = 5.0 * creditHour2;
//        }
//        if(score2 >=80 && score2 <= 84){
//            grade2 = "A";
//            point2 = 4.5 * creditHour2;
//        }
//        if(score2 >=75 && score2 <= 79){
//            grade2 = "B+";
//            point2 = 4.0 * creditHour2;
//        }
//        if(score2 >=70 && score2 <= 74){
//            grade2 = "B";
//            point2 = 3.5 * creditHour2;
//        }
//        if(score2 >=65 && score2 <= 69){
//            grade2 = "C+";
//            point2 = 3.0 * creditHour2;
//        }
//        if(score2 >=60 && score2 <= 64){
//            grade2 = "C";
//            point2 = 2.5 * creditHour2;
//        }
//        if(score2 >=55 && score2 <= 59){
//            grade2 = "D+";
//            point2 = 2.0 * creditHour2;
//        }
//        if(score2 >=50 && score2 <= 54){
//            grade2 = "D";
//            point2 = 1.5 * creditHour2;
//        }
//        if(score2 >=0 && score2 <= 49){
//            grade2 = "F";
//            point2 = 0.0 * creditHour2;
//        }
//        System.out.println("---------------------------------------------------");
//
//        System.out.println("Maths");
//        System.out.print("Scores: ");
//        score3 = aj.nextDouble();
//        System.out.print("Credit Hour(s): ");
//        creditHour3 = aj.nextDouble();
//        if(score3 >=85 && score3 <= 100){
//            grade3 = "A+";
//            point3 = 5.0 * creditHour3;
//        }
//        if(score3 >=80 && score3 <= 84){
//            grade3 = "A";
//            point3 = 4.5 * creditHour3;
//        }
//        if(score3 >=75 && score3 <= 79){
//            grade3 = "B+";
//            point3 = 4.0 * creditHour3;
//        }
//        if(score3 >=70 && score3 <= 74){
//            grade3 = "B";
//            point3 = 3.5 * creditHour3;
//        }
//        if(score3 >=65 && score3 <= 69){
//            grade3 = "C+";
//            point3 = 3.0 * creditHour3;
//        }
//        if(score3 >=60 && score3 <= 64){
//            grade3 = "C";
//            point3 = 2.5 * creditHour3;
//        }
//        if(score3 >=55 && score3 <= 59){
//            grade3 = "D+";
//            point3 = 2.0 * creditHour3;
//        }
//        if(score3 >=50 && score3 <= 54){
//            grade3 = "D";
//            point3 = 1.5 * creditHour3;
//        }
//        if(score3 >=0 && score3 <= 49){
//            grade3 = "F";
//            point3 = 0.0 * creditHour3;
//        }
//        System.out.println("---------------------------------------------------");
//
//        System.out.println("Maths");
//        System.out.print("Scores: ");
//        score4 = aj.nextDouble();
//        System.out.print("Credit Hour(s): ");
//        creditHour4 = aj.nextDouble();
//        if(score4 >=85 && score4 <= 100){
//            grade4 = "A+";
//            point4 = 5.0 * creditHour4;
//        }
//        if(score4 >=80 && score4 <= 84){
//            grade4 = "A";
//            point4 = 4.5 * creditHour4;
//        }
//        if(score4 >=75 && score4 <= 79){
//            grade4 = "B+";
//            point4 = 4.0 * creditHour4;
//        }
//        if(score4 >=70 && score4 <= 74){
//            grade4 = "B";
//            point4 = 3.5 * creditHour4;
//        }
//        if(score4 >=65 && score4 <= 69){
//            grade4 = "C+";
//            point4 = 3.0 * creditHour4;
//        }
//        if(score4 >=60 && score4 <= 64){
//            grade4 = "C";
//            point4 = 2.5 * creditHour4;
//        }
//        if(score4 >=55 && score4 <= 59){
//            grade4 = "D+";
//            point4 = 2.0 * creditHour4;
//        }
//        if(score4 >=50 && score4 <= 54){
//            grade4 = "D";
//            point4 = 1.5 * creditHour4;
//        }
//        if(score4 >=0 && score4 <= 49){
//            grade4 = "F";
//            point4 = 0.0 * creditHour4;
//        }
//        System.out.println("---------------------------------------------------");
//
//        System.out.println("Maths");
//        System.out.print("Scores: ");
//        score5 = aj.nextDouble();
//        System.out.print("Credit Hour(s): ");
//        creditHour5 = aj.nextDouble();
//        if(score5 >=85 && score5 <= 100){
//            grade5 = "A+";
//            point5 = 5.0 * creditHour5;
//        }
//        if(score5 >=80 && score5 <= 84){
//            grade5 = "A";
//            point5 = 4.5 * creditHour5;
//        }
//        if(score5 >=75 && score5 <= 79){
//            grade5 = "B+";
//            point5 = 4.0 * creditHour5;
//        }
//        if(score5 >=70 && score5 <= 74){
//            grade5 = "B";
//            point5 = 3.5 * creditHour5;
//        }
//        if(score5 >=65 && score5 <= 69){
//            grade5 = "C+";
//            point5 = 3.0 * creditHour5;
//        }
//        if(score5 >=60 && score5 <= 64){
//            grade5 = "C";
//            point5 = 2.5 * creditHour5;
//        }
//        if(score5 >=55 && score5 <= 59){
//            grade5 = "D+";
//            point5 = 2.0 * creditHour5;
//        }
//        if(score5 >=50 && score5 <= 54){
//            grade5 = "D";
//            point5 = 1.5 * creditHour5;
//        }
//        if(score5 >=0 && score5 <= 49){
//            grade5 = "F";
//            point5 = 0.0 * creditHour5;
//        }
//        System.out.println("---------------------------------------------------");
//
//        System.out.println("Maths");
//        System.out.print("Scores: ");
//        score6 = aj.nextDouble();
//        System.out.print("Credit Hour(s): ");
//        creditHour6 = aj.nextDouble();
//        if(score6 >=85 && score6 <= 100){
//            grade6 = "A+";
//            point6 = 5.0 * creditHour6;
//        }
//        if(score6 >=80 && score6 <= 84){
//            grade6 = "A";
//            point6 = 4.5 * creditHour6;
//        }
//        if(score6 >=75 && score6 <= 79){
//            grade6 = "B+";
//            point6 = 4.0 * creditHour6;
//        }
//        if(score6 >=70 && score6 <= 74){
//            grade6 = "B";
//            point6 = 3.5 * creditHour6;
//        }
//        if(score6 >=65 && score6 <= 69){
//            grade6 = "C+";
//            point6 = 3.0 * creditHour6;
//        }
//        if(score6 >=60 && score6 <= 64){
//            grade6 = "C";
//            point6 = 2.5 * creditHour6;
//        }
//        if(score6 >=55 && score6 <= 59){
//            grade6 = "D+";
//            point6 = 2.0 * creditHour6;
//        }
//        if(score6 >=50 && score6 <= 54){
//            grade6 = "D";
//            point6 = 1.5 * creditHour6;
//        }
//        if(score6 >=0 && score6 <= 49){
//            grade6 = "F";
//            point6 = 0.0 * creditHour6;
//        }
//        System.out.println("---------------------------------------------------");
//
//        System.out.println("Maths");
//        System.out.print("Scores: ");
//        score7 = aj.nextDouble();
//        System.out.print("Credit Hour(s): ");
//        creditHour7 = aj.nextDouble();
//        if(score7 >=85 && score7 <= 100){
//            grade7 = "A+";
//            point7 = 5.0 * creditHour7;
//        }
//        if(score7 >=80 && score7 <= 84){
//            grade7 = "A";
//            point7 = 4.5 * creditHour7;
//        }
//        if(score7 >=75 && score7 <= 79){
//            grade7 = "B+";
//            point7 = 4.0 * creditHour7;
//        }
//        if(score7 >=70 && score7 <= 74){
//            grade7 = "B";
//            point7 = 3.5 * creditHour7;
//        }
//        if(score7 >=65 && score7 <= 69){
//            grade7 = "C+";
//            point7 = 3.0 * creditHour7;
//        }
//        if(score7 >=60 && score7 <= 64){
//            grade7 = "C";
//            point7 = 2.5 * creditHour7;
//        }
//        if(score7 >=55 && score7 <= 59){
//            grade7 = "D+";
//            point7 = 2.0 * creditHour7;
//        }
//        if(score7 >=50 && score7 <= 54){
//            grade7 = "D";
//            point7 = 1.5 * creditHour7;
//        }
//        if(score7 >=0 && score7 <= 49){
//            grade7 = "F";
//            point7 = 0.0 * creditHour7;
//        }
    }
}
