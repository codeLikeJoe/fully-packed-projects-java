package com.School;

public class resultCal_A {
    static double totalPoints, C_gpa, totalGpa, totalCgpa;
    static int sem, totalCredits;
    static int numberOfCourses = 7;
    static String eee = "EEE 110";
    static String sta = "STA 102";
    static String comp = "CPS 110";
    static String hardW = "CPS 108";
    static String dMath = "CPS 106";
    static String pro = "CPS 104";
    static String comS = "COS 102";

    public static int getSem() {
        return sem;
    }

    public static void setSem(int sem) {
        resultCal_A.sem = sem;
    }

    public static void head() {
        line();
        System.out.println();
        System.out.print("Course ID\tCourse Title\t\t\t\t\t\t\t\t\t\t\tCR\tMark\tGrade\tPoints\tGPA\n");
        line();
        System.out.println();
    }

    public static void line() {
        for (int i = 0; i < 35; i++) {
            System.out.print("---");
        }
    }

    public static void sp() {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t------------------");
    }
}
