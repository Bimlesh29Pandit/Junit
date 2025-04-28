//package com.spring.junit.calulatorTest;
//
//import java.util.Date;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//import com.spring.junit.calculator.CalulatorFun;
//
//
//// this is spring 4 application and annotation.
//public class CalulatorFunTest {
//	
//	@BeforeClass
//	public static void init() {
//		System.out.println("Before all test cases:");
//		System.out.println("Started test : "+ new Date() );
//	}
//	
//	@Test
//	public void addTwoNumberTest() {
//		
//		System.out.println("test for addTwoNumberTest");
//		
//		int acutalResult = CalulatorFun.sumTwoNumber(12,45);
//		int expectedResult = 57;
//		
//		Assert.assertEquals(expectedResult, expectedResult);
//	}
//	@Before
//	public void beforeEach() {
//		System.out.println("Before each test case");
//	}
//	@After
//	public void afterEach() {
//		System.out.println("after each test case");
//	}
//	
//	@Test
//	public void productTwoNumberTest() {
//		System.out.println("test for productTwoNumberTest");
//		int actual = CalulatorFun.productTwoNumber(2, 5);
//		int expectedResult = 10;
//		
//		Assert.assertEquals(expectedResult, actual);
//	}
//	@Test
//	public void sumAnyNumberTest() {
//		System.out.println("test for sumAnyNumberTest");
//		int actualResult = CalulatorFun.sumAnyNum(2,3,5,6,7);
//		int expectedResult = 23;
//		Assert.assertEquals(expectedResult, actualResult);
//	}
//	
//	@AfterClass
//	public static void cleanUp() {
//		System.out.println("After all test cases");
//		System.out.println("end test cases : "+new Date());
//	}
//
//}
