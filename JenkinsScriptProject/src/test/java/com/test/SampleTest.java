package com.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.demo.SampleClass;

public class SampleTest {

	SampleClass sample;
	
	public SampleTest() {
		this.sample = new SampleClass();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Before
	public void methodBefore() {
		System.out.println("--Before method--");
	}
	
	@After
	public void methodAfter() {
		System.out.println("--After method--");
	}
	

	@Test
	public void testMethodDemo1() {
		System.out.println("--testing testMethodDemo1--");;
		sample.methodDemo1();
	}
	
	@Test
	public void testMethodDemo2() {
		System.out.println("--testing testMethodDemo2--");;
		sample.methodDemo2();
	}

	@Test
	public void testMethodDemo3() {
		System.out.println("--testing testMethodDemo3--");;
		sample.methodDemo3();
	}
	
	
}
