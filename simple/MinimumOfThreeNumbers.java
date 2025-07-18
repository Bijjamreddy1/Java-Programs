package com.bharath.javaprograms.simple;

import java.util.Scanner;

public class MinimumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();

        scanner.close();
        
        //First Way
        int minimum=0;
        minimum = num1 <(num2 <num3 ? num2:num1) ? num1 : (num2<num3 ? num2:num3);
        System.out.println("The minimum of the three numbers is: " + minimum);

        //Second Way
        int min = findMinimum(num1, num2, num3);
        System.out.println("The minimum of the three numbers is: " + min);
        
        //Third Way
        int minimumOfThree=Math.min(num1, Math.min(num2, num3));
        System.out.println("The minimum of the three numbers is: " + minimumOfThree);
    }

    public static int findMinimum(int num1, int num2, int num3) {
        if (num1 <= num2 && num1 <= num3) {
            return num1;
        } else if (num2 <= num1 && num2 <= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
