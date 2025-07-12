package com.bharath.javaprograms.simple;

import java.util.Scanner;

public class MaxOfThreeNumbers {
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
        int maximum=0;
        maximum = num3 >(num2 >num1 ? num2:num1) ? num3 : (num2>num3 ? num2:num3);
        System.out.println("The maximum of the three numbers is: " + maximum);

        //Second Way
        int max = findMax(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + max);
        
        //Third Way
        int maximumOfThree=Math.max(num1, Math.max(num2, num3));
        System.out.println("The maximum of the three numbers is: " + maximumOfThree);
    }

    public static int findMax(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
