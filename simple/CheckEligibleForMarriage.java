package com.bharath.javaprograms.simple;

import java.util.Scanner;

public class CheckEligibleForMarriage {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the girl age: ");
        int girl = scanner.nextInt();

        System.out.println("Enter the boy age: ");
        int boy = scanner.nextInt();
        
        System.out.println(checkEligible(girl, boy));
        scanner.close();
	}

	private static boolean checkEligible(int girl, int boy) {
		
		if(girl>= 18 && boy >= 21 ) {
			return true;
		}
		else {
			return false;
		}
	}

}
