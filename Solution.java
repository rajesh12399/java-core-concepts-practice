package com.core.test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// int n = scanner.nextInt();

//        for(int i = 1 ; i <= n; i++) {
//        	
//        	if(i % 15 == 0) {
//        		System.out.println("FizzBuzz");
//        	}else if(i % 3 == 0) {
//        		System.out.println("Fizz");
//        	}else if(i % 5 == 0) {
//        		System.out.println("Buzz");
//        	}else {
//        		System.out.println(i);
//        	}
//        }

		// n= 5;

		//int arr = [ 5, 1, 3, 7, 3 ];
		
		//a = ['a', 'jk', 'abb', 'mn', 'abc']
		//b = ['bb', 'kj', 'bbc', 'op', 'def']
		
		List<String> arr = new ArrayList<String>();
		arr.add("a");
		arr.add("jk");
		arr.add("abb");
		arr.add("mn");
		arr.add("abc");
		
		
		
		List<String> brr = new ArrayList<String>();
		brr.add("bb");
		brr.add("kj");
		brr.add("bbc");
		brr.add("op");
		brr.add("def");
		
		for(int i = 0 ; i < arr.size() -1 ; i++) {
			
			for(int j= i ; j<brr.size() - 1 ; j++) {
				char a[] =  arr.get(i).toCharArray();
				char b[] =  brr.get(j).toCharArray();	
				Arrays.sort(a);
				
				Arrays.sort(b);
				Boolean result  = Arrays.equals(a, b);
				if(result == true ) {
					System.out.println("0");
					break;
				}else if (a.length < b.length) {
					System.out.println("-1");
					break;
				}else if (a.length == b.length) {
					
					for(int k=0; i < a.length; i++)
		            {
						System.out.println(a[i]);
		                if(b.equals(a[i])){
		                	System.out.println(a[i]);
		                    System.out.println(b);
		                }
		            }
	
				}
				
				
			}
		}
		
//		System.out.println(arr);
//
//		Collections.sort(arr);
//		System.out.println(arr);
//
//		int sum = 0;
//		int finalResult = 0;
//
//
//		for (int i = 0; i < arr.size() - 1; i++) {
//
//			sum = arr.get(i);
//
//			sum = sum - arr.get(i + 1);
//
//			if (sum < 0) {	
//				sum = (~sum) + 1;
//			}
//			System.out.println(sum);
//			finalResult = finalResult + sum;
//		}
//
//		System.out.println(finalResult);

		// scanner.close();
	}

}
