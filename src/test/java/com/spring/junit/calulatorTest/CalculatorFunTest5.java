package com.spring.junit.calulatorTest;

import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.spring.junit.calculator.CalulatorFun;

public class CalculatorFunTest5 {
	
	@BeforeAll
	public static void init() {
		System.out.println("Before all test cases:");
		System.out.println("Started test : "+ new Date() );
	}
	
	@Test
	public void sumTwoNumberTest() {
		System.out.println("test for sumTwoNumberTest");
		int acturalResult = CalulatorFun.sumTwoNumber(5, 9);
		int expectedResult = 14;
		Assertions.assertEquals(expectedResult, acturalResult);
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Before each test case");
	}
	@AfterEach
	public void afterEach() {
		System.out.println("after each test case");
	}
	
	@Test
	@Disabled
	public void productTwoNumberTest() {
		System.out.println("test for productTwoNumberTest");
		int actual = CalulatorFun.productTwoNumber(2, 5);
		int expectedResult = 10;
		
		Assertions.assertEquals(expectedResult, actual);
	}
	
	@AfterAll
	public static void cleanUp() {
		System.out.println("After all test cases");
		System.out.println("end test cases : "+new Date());
	}

}
