package com.core.test;

import java.util.Scanner;

public class DataTypeRange {
	
	private static long getValuePower(long x, int p){
		
		if(p == 0) {
			return 1;
		}else {
			
			return x * getValuePower(x, p-1);
			
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try
        {
			//byte, short, int, float, char, double, long, boolean
			long intValue = 0;
			long longValue = 0;
            long x=sc.nextLong();
            System.out.println(x+" can be fitted in:");
            if(x>=-128 && x<=127)System.out.println("* byte");
            if(x>=-32768 && x<=32767)System.out.println("* short");
           
            if(intValue == 0) {
            	 intValue = getValuePower(2, 32);
            }
            if(longValue == 0) {
            	
           	 longValue = getValuePower(intValue, 2);
           }
            
            if(x >= -intValue && x <= intValue) {
            	System.out.println("* int");
            }
            if(x >= -longValue && x <= longValue) {
            	System.out.println("* long");
            }
            
            
            
          
            //Complete the code
        }
        catch(Exception e)
        {
            System.out.println(sc.next()+" can't be fitted anywhere.");
        }

	}

}
