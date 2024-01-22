package com.arrayprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

public class FindSmallestNumberInArray {

	public static void main(String[] args) {
		int arr[]=new int[] {12,15,2,34,123};
		
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		System.out.println(min);
		
		
		
		Integer maxiInteger = Arrays.stream(arr).boxed().max(Integer::compare).get();
		System.out.println(maxiInteger);
		
		  Integer maximum1 = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).findFirst().get();
		  System.out.println(maximum1);
		  
		  Integer minimum = Arrays.stream(arr).boxed().sorted().findFirst().get();
		  System.out.println(minimum);
	}
}
