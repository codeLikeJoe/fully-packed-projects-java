package com.ajnetworks;

import java.util.Scanner;

public class setty {
    public static void main(String[] args) {
        Scanner aj = new Scanner(System.in);

        double[] height = new double[2];
        double[] weight = new double[2];
        double[] BMI = new double[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Person (" + (i + 1) + ") Details:");
            System.out.println("-------------------------");
            System.out.print("Enter Person's height: ");
            height[i] = aj.nextDouble();
            System.out.print("Enter Person's weight: ");
            weight[i] = aj.nextDouble();
            BMI[i] = (weight[i] / Math.pow(height[i], 2)) * 703;
        }


        System.out.println("BMI Results");
        System.out.println("-------------");
        for (int i = 0; i < 2; i++) {
            System.out.printf("BMI for Person (" + (i + 1) + ") is: %.2f\n", BMI[i]);
            if (BMI[i] < 18.5) {
                System.out.println("Underweight");
            } else if ((BMI[i] >= 18.5) && (BMI[i] <= 24.9)) {
                System.out.println("Normal");
            } else if ((BMI[i] >= 25.0) && (BMI[i] <= 29.9)) {
                System.out.println("Overweight");
            } else if ((BMI[i] >= 30.0)) {
                System.out.println("Obese");
            }
        }
    }
}