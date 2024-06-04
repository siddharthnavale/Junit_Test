package com.nimap.junit.JunitDemo.serviceTest;

import java.util.Date;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.nimap.junit.JunitDemo.service.Logic;



public class LogicTestForJunit5 {
	
	@BeforeAll //similar to @BeforeClass
	public static void  init() {
	
	 //before all test cases
		System.out.println("Started time" + new Date());
	}
	
	@BeforeEach
	public  void  beforeEachTestCase() {
		
		 //executes the method before each test case
			System.out.println("before each test case");
		} 
	
	
	@Test//(timeout = 2000)//we cannot mention timeout in junit 5
	public void addTest() {
		System.out.println("test for addTest");
		int result=Logic.add(12, 12);
		
		int expected =24;
		
		Assertions.assertEquals(expected, result,"Test Failed");
				
	}

	@Test
	@Disabled //to ignore test case
	@DisplayName("sumTest") //the @DisplayName annotation is used to provide a custom name for a test class or test method.
	public void sumTest() {
		
		System.out.println("test for sumTest");
		
		int result=Logic.sum(2,7,9,8);
		
		int expected =26;
		
		Assertions.assertEquals(expected, result);
				
	}
	@AfterEach
	public  void  afterEachTestCase() {
		
		 //executes the method after each test case
			System.out.println("after each test case");
	}
	
	@AfterAll
	public static void  cleanup() {
	
	 //after all test cases
		System.out.println("Started time" + new Date());
	}
}
