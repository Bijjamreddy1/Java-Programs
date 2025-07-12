package com.bharath.javaprograms.simple;

public class FirstEvenNumberInArray {

	public static void main(String[] args) {

		int[] arr1= {1,2,6,3,5};
		int[] arr2= {1,7,3,5};
		int[] arr3= {1,7,4,8,5};
		
		int result1=findEven(arr1);
		int result2=findEven(arr2);
		int result3=findEven(arr3);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

	private static int findEven(int[] numbers) {
		
		for(int num:numbers) {
			if(num % 2==0) {
				return num;
			}
			
		}
		return -1;
	}

}
