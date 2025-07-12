package com.bharath.javaprograms.simple;

import java.util.Scanner;

public class MidOfThreeNumbers {
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
        int midValue=0;
        midValue = (num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3) ? num1
                : (num2 >= num1 && num2 <= num3) || (num2 <= num1 && num2 >= num3) ? num2
                : num3;
        System.out.println("The middle of the three numbers is: " + midValue);

        //Second Way
        int middle = findMiddle(num1, num2, num3);
        System.out.println("The middle of the three numbers is: " + middle);
        
        //Third Way
        int middleOfThree=Math.max(num1, Math.min(num2, num3));
        System.out.println("The middle of the three numbers is: " + middleOfThree);
    }

    public static int findMiddle(int num1, int num2, int num3) {
    	

        if ((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3)) {
            return num1;
        } else if ((num2 >= num1 && num2 <= num3) || (num2 <= num1 && num2 >= num3)) {
        	return num2;
        } else {
        	return num3;
        }

        
    }
}
