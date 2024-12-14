package ch02;

public class _01_IfEx {
	//3일차 4교시
	public static void main(String args[]) {
		
		/*
		int age = 24;
		System.out.println("age: " + age); //24
		
		int num = 10;
		int num2 = -num;
		System.out.println("num: " + num); //10
		System.out.println("num2: " + num2); //-10
		*/
		
		int num1 = 5;
		int num2 = 10;
		int result1 = num1 & num2; // num1 (5) & num2 (10)  = 겹치는 값이 없기에 0
		System.out.println("result1: " + result1);
		
		int result2 = num1 | num2; // num1 (5) | num2 (10) =  1개라도 겹치는 값이 없기에 
		System.out.println("result2: " + result2);

	}	
}











