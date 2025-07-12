package com.bharath.javaprograms.simple;

import java.util.ArrayList;
import java.util.List;

public class OddElementsFromArray {

	public static void main(String[] args) {
		
		int[] numbers= {1,5,6,4,3,2,8};
		
		List<Integer> oddElements= findOddElements(numbers);
		System.out.println(oddElements);
				
	}

	private static List<Integer> findOddElements(int[] numbers) {

		List<Integer> oddElements=new ArrayList<Integer>();
		
		for(int num:numbers) {
			if(num % 2 !=0) {
				oddElements.add(num);
			}
		}
	
		return oddElements;
	}

}
