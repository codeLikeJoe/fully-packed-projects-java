package com.ajnetworks;

import java.util.Scanner;

public class Question1 {
    double InterestRate, Amount, numberOfMonth;

    public double getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(double interestRate) {
        InterestRate = interestRate;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public double getNumberOfMonth() {
        return numberOfMonth;
    }

    public void setNumberOfMonth(double numberOfMonth) {
        this.numberOfMonth = numberOfMonth;
    }

    public static double interestCalculator(double amountBorrowed, double interestRate, double numberOfYears) {
        double interestOne = amountBorrowed * interestRate * numberOfYears / 100;
        return interestOne;
    }

    public static double compoundInterest(double sumOfAmountAndInterest1, double interestRate, double numberOfYears) {
        double interestTwo = sumOfAmountAndInterest1 * interestRate * numberOfYears / 100;
        return interestTwo;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Question1 Aj = new Question1();
        System.out.print("Enter Interest rate\t: ");
        Aj.setInterestRate(in.nextDouble());
        System.out.print("Amount To Be Borrowed\t: ");
        Aj.setAmount(in.nextDouble());
        System.out.print("Number Of Month Required To Pay\t: ");
        Aj.setNumberOfMonth(in.nextDouble());

        double Years = Aj.getNumberOfMonth() / 12;
        System.out.println("------------------------------------");
        System.out.printf("Amount Borrowed\t\t:\t%.2f\n", Aj.getAmount());
        double interest1 = interestCalculator(Aj.getAmount(), Aj.getInterestRate(), Years);
        System.out.printf("First Interest\t\t:\t%.2f\n", interest1);
        double sum_AmountAndInterest1 = interest1 + Aj.getAmount();
        double interest2 = compoundInterest(sum_AmountAndInterest1, Aj.getInterestRate(), Years);
        System.out.printf("Second Interest\t\t:\t%.2f\n", interest2);
        double totalAmountToPay = interest1 + interest2 + Aj.getAmount();
        System.out.printf("Total Amount To Pay\t:\t%.2f\n", totalAmountToPay);
    }
}
