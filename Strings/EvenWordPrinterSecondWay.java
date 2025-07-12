package com.bharath.javaprograms.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EvenWordPrinterSecondWay {

	
	
	public static void main(String[] args) {
		
		
		
		List<Integer> arr=new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		
		List<Integer> res=new ArrayList<Integer>();
		Set<Integer> set =new HashSet<Integer>();
		System.out.println(arr);
		
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i) % 2==0) {
				res.add(arr.get(i));
			}
		}
		
		System.out.println(res);
		
		
		for(int i=0;i<arr.size();i++) {
			if(!set.contains(arr.get(i))) {
				set.add(arr.get(i));
			}
		}
		
		System.out.println(set);
	}
		
		
		
		
		
		
	
	

}
