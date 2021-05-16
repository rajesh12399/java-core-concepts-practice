package com.core.test;

public class ClassB extends ClassA{
	
	public void printName()
	{
		try {
			
		} catch (ArithmeticException ex) {
			// TODO: handle exception
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Class B Method");
	}
	
	
	public static void main(String[] args) {
		
		ClassA a = new ClassB();
		a.printName();
		a.printName();
	}
	
	
	
}

