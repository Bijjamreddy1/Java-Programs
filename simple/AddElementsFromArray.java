package com.bharath.javaprograms.simple;

import java.util.Arrays;

public class AddElementsFromArray {

	public static void main(String[] args) {
		
		int[] numbers= {1,2,6,3,5};
		
		//First Method
		int sum=Arrays.stream(numbers).sum();
		System.out.println("sum of array elements "+ sum);
		
		//Second Method
		int result= AddElements(numbers);
		System.out.println("sum of array elements "+ result);
				
	}

	private static int AddElements(int[] numbers) {
		
		int val=0;
		for(int num:numbers) {
			val= val+ num;
		}
	
		return val;
	}

}
