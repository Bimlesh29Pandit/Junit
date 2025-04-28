package com.spring.junit.calculator;


public class CalulatorFun {
	
	public static int sumTwoNumber(int a, int b) {
		return a+b;
	}
	
	public static int productTwoNumber (int a , int b) {
		return a*b;
	}
	
	public static int divideTwoNumber(int a, int b) {
		return a/b;
	}
	
	public static int sumAnyNum(int ...number) {
		int sum = 0;
		for(int num :number) {
			sum+=num;
		}
		
		return sum;
	}
	
	

}
