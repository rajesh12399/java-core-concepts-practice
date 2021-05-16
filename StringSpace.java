package com.core.test;

import java.util.Scanner;

public class StringSpace {
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
        	int j = 0;
        	int m = 15;
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.print(s1);
            
            int n = s1.length();
            while( j<= m-n) {
            	System.out.print(" ");	
            	j++;
            }
            int val = String.valueOf(x).length();
            if(val < 3){
            	while(val < 3) {
            		System.out.print("0");
            		val++;
            	}
            	System.out.print(x);
            		
            }else {
            	System.out.print(x);	
            }
            System.out.println();
            //Complete this line
        }
        System.out.println("================================");

}

}
