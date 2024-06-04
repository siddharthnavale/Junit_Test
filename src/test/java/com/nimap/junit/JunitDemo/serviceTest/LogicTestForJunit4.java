//package com.nimap.junit.JunitDemo.serviceTest;
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
//import com.nimap.junit.JunitDemo.service.Logic;
//
//
//
//public class LogicTestForJunit4 {
//	
//	@BeforeClass
//	public static void  init() {
//	
//	 //before all test cases
//		System.out.println("Started time" + new Date());
//	}
//	
//	@Before
//	public static void  beforeEachTestCase() {
//		
//		 //executes the method before each test case
//			System.out.println("before each test case");
//		}
//	
//	
//	@Test(timeout = 2000)//This means that if the test method takes longer than the specified time (in milliseconds) to execute, it will be automatically failed by the JUnit framework
//	public void addTest() {
//		System.out.println("test for addTest");
//		int result=Logic.add(67, 30);
//		
//		int expected =97;
//		
//		Assert.assertEquals(expected, result);
//				
//	}
//	
//	@Test
//	public void sumTest() {
//		
//		System.out.println("test for sumTest");
//		
//		int result=Logic.sum(2,7,9,8);
//		
//		int expected =26;
//		
//		Assert.assertEquals(expected, result);
//				
//	}
//	
//	@After
//	public static void  afterEachTestCase() {
//		
//		 //executes the method after each test case
//			System.out.println("after each test case");
//		}
//	
//	@AfterClass
//	public static void  cleanup() {
//	
//	 //after all test cases
//		System.out.println("Started time" + new Date());
//	}
//
//}
