package com.test;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount=10)
	public void sum() {
		
		int a=2;
		int b=3;
		int sum=a+b;
		System.out.println(sum);
	}

}
