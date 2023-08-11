package com.QThreeID;

import java.util.Locale;
import java.util.Scanner;

public class StoreItem {
    long itemNumber;
    String category;
    String itemName;
    boolean isClothingItem;
    double unitPrice;

    public long getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(long itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public boolean isClothingItem() {
        return isClothingItem;
    }

    public void setClothingItem(boolean clothingItem) {
        isClothingItem = clothingItem;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    Scanner in = new Scanner(System.in);

    void ask() {
        System.out.print("Enter Item Number: ");
        setItemNumber(in.nextLong());
        in.nextLine();
        System.out.println("Enter Item Category\nWOMEN\nMEN\nBOYS\nGIRLS\nBABIES");
        System.out.println("------------------------------");
        setCategory(in.nextLine().toUpperCase(Locale.ROOT));
        System.out.print("Enter Item Name: ");
        setItemName(in.nextLine().toUpperCase(Locale.ROOT));
        System.out.print("Enter Unit Price: ");
        setUnitPrice(in.nextDouble());
        in.nextLine();
        System.out.println("Clothing Item? True//False?");
        setClothingItem(in.hasNext());
    }

    void createItem() {
        this.itemNumber = getItemNumber();
        this.category = getCategory();
        this.itemName = getItemName();
        this.isClothingItem = isClothingItem();
        this.unitPrice = getUnitPrice();
    }

    void display() {
        System.out.println("Department Store");
        System.out.println("*****************");
        System.out.println("Stock #: " + this.itemNumber);
        System.out.println("Clothing item: " + this.isClothingItem);
        System.out.println("Category: " + this.category);
        System.out.println("Name: " + this.itemName);
        System.out.println("Unit Price: " + this.unitPrice);
        in.nextLine();
    }
}
