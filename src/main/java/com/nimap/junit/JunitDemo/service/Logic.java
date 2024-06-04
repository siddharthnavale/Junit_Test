package com.nimap.junit.JunitDemo.service;

public class Logic {
	
	public static int add(int a, int b) {
	
	  return a+b;
	  
	}
	
	public static int product(int a, int b) {
		
		  return a*b;
		  
		}
  
	public static int divide(int a, int b) {
		
		  return a/b;
		  
		}
	
	public static int sum(int ... numbers) {
		
		int sum =0;
		
		  for(int n :numbers){
			 sum =sum + n; 
		  }
		  
		  return sum;
		}
}
