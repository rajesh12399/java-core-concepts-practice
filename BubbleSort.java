package com.core.test;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		
		int arr[] = new int[7];
		
		
		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 4;
		arr[3] = 8;
		arr[4] = -1;
		arr[5] = 19;
		arr[6] = 7;
		
		
		for (int i = 0; i < arr.length -1 ; i++) {
			
			
			if(arr[i] > arr[i + 1]) {
				
				arr[i] = arr[i + 1];;
			}
			
			
			System.out.println(arr[i]);
			
		}
		
	}

}
