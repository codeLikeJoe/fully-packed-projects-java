package com.ajnetworks;

import java.util.Scanner;

public class myJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        sett piz = new sett();

        double totalTax, totalPrice, totalD, sumTotal, subTotal, bill, change, paid;
        totalD = 0;
        totalPrice = 0;
        sumTotal = 0;
        subTotal = 0;
        bill = 0;

        System.out.print("Enter # of item(s)\t: ");
        int numb = scan.nextInt();
        scan.nextLine();

        String[] item = new String[numb];
        double[] EachVat = new double[numb];
        double[] EachNet = new double[numb];
        double[] EachDon = new double[numb];
        double[] subTo = new double[numb];
        double[] Dis = new double[numb];
        int[] quan = new int[numb];
        double[] price = new double[numb];
        double[] dis = new double[numb];
        double[] vat = new double[numb];
        double[] net = new double[numb];
        double[] don = new double[numb];
        double[] total = new double[numb];
        double[] totax = new double[numb];
        for (int i = 0; i < numb; i++) {
            piz.F();
            System.out.println();
            System.out.print("Item (" + (i + 1) + ")\t: ");
            item[i] = scan.nextLine();
            System.out.print("Quantity\t: ");
            quan[i] = scan.nextInt();
            System.out.print("Price\t\t: ");
            price[i] = scan.nextDouble();
            System.out.print("Discount(%)\t: ");
            dis[i] = scan.nextDouble();
            System.out.print("VAT(%)\t\t: ");
            vat[i] = scan.nextDouble();
            System.out.print("NET(%)\t\t: ");
            net[i] = scan.nextDouble();
            System.out.print("Donation(%)\t: ");
            don[i] = scan.nextDouble();
            scan.nextLine();

            totalPrice = totalPrice + price[i];
            EachVat[i] = (vat[i] / 100) * price[i];
            EachNet[i] = (net[i] / 100) * price[i];
            EachDon[i] = (don[i] / 100) * price[i];
            totax[i] = EachVat[i] + EachDon[i] + EachNet[i];
            total[i] = price[i] * quan[i];
            sumTotal = sumTotal + total[i];
            subTo[i] = total[i] - totax[i];
            subTotal = subTotal + subTo[i];
            Dis[i] = (dis[i] / 100) * price[i];
            totalD += Dis[i];
            bill = sumTotal - totalD;
        }
        piz.F();
        System.out.println();
        System.out.println("BILL\t\t\t:\t" + bill);
        System.out.print("Enter Amount Paid\t: ");
        paid = scan.nextDouble();
        scan.nextLine();
        change = paid - bill;
        piz.F();
        System.out.println();
        piz.adr();
        piz.d();
        System.out.print("RECEIPT");
        piz.d();
        System.out.println();
        piz.give();
        piz.F();
        System.out.println();
        System.out.println("Item(s)/t\t\t\t\t\tQty.\t\tPrice\t\tTotal");
        piz.F();
        System.out.println();
        for (int i = 0; i < numb; i++) {
            System.out.print(item[i]);
            System.out.print("\t\t\t\t\t\t" + quan[i]);
            System.out.printf("\t\t%.2f", price[i]);
            System.out.printf("\t\t%.2f\n", total[i]);
        }
        for (int i = 0; i < numb; i++) {
            piz.F();
            System.out.println();
            System.out.println("Item(" + (i + 1) + ")");
            System.out.printf("SUB TOTAL\t\t:\t\t\t\t\t\t\t\t\t%.2f\n", subTo[i]);
            System.out.print("VAT(" + vat[i] + "%)\t\t");
            System.out.printf(":\t\t\t\t\t\t\t\t\t%.2f\n", EachVat[i]);
            System.out.print("NET(" + net[i] + "%)\t\t");
            System.out.printf(":\t\t\t\t\t\t\t\t\t%.2f\n", EachNet[i]);
            System.out.print("DONATION(" + don[i] + "%)\t");
            System.out.printf(":\t\t\t\t\t\t\t\t\t%.2f\n", EachDon[i]);
            piz.F();
            System.out.println();
            System.out.printf("DISCOUNT\t\t:\t\t\t\t\t\t\t\t\t%.2f\n", Dis[i]);
            piz.F();
            System.out.println();
        }
        System.out.printf("TOTAL\t\t\t\t\t\t\t\t\t\t\t\t%.2f\n", bill);
        System.out.printf("AMOUNT PAID\t\t\t\t\t\t\t\t\t\t\t%.2f\n", paid);
        piz.F();
        System.out.println();
        System.out.printf("CHANGE\t\t\t\t\t\t\t\t\t\t\t\t%.2f\n", change);
        piz.F();
        System.out.println();
        System.out.println("Thanks for buying from us!!");
    }
}