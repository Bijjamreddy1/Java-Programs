package com.bharath.javaprograms.simple;

import java.util.Scanner;

public class CalculateTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the bill amount: ");
        double billAmount = scanner.nextDouble();

        double taxAmount = (billAmount > 50000) ? (billAmount * 0.10) : (billAmount * 0.05);

        System.out.println("Tax Amount: " + taxAmount);

        scanner.close();
    }
}		