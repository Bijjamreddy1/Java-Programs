package com.bharath.javaprograms.simple;

import java.util.Scanner;

public class DecreasingPattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;i+j<=num+1; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
		sc.close();
	}

}
