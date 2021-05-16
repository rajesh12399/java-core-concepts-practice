package com.core.test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Array {
	

	    // Complete the reverseArray function below.
	    static int[] reverseArray(int[] a) {
	    	
	    	int[] j = new int[a.length];
	    	
	    	for(int i = 0 ; i <= a.length -1 ; i++) {
	    		
	    		int k = a[(a.length-1) - i];
	    		
	    		j[i] = k;
	    	}
	    	
			return j;
	    
	    


	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {

	        int arrCount = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] arr = new int[arrCount];

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < arrCount; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }

	        int[] res = reverseArray(arr);


	        scanner.close();
	    }
	}

