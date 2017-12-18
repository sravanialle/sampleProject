package mySampleProject;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public  class TestJunit extends TestCase  {
	
	 String message = "Hello Test Case"; ;
	 int a,b;
	
	@Before
	public void setup(){
		a = 10; b=80;
		message = "Hello Test Case";
		System.out.println("values assigned "+ a + " " + b + " " + message);
	}
	
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage(){	

		assertEquals(message, messageUtil.printMessage());
		System.out.println("Test Case Number " + this.countTestCases());
		System.out.println("Test Case Name = "+ this.getName());
	      System.out.println("Updated Test Case Name = "+ this.getName() + "Update");
	}
	@Test
	public void testAdd(){
		
		assertEquals(90,Calculation.add(10, 80));
		System.out.println("Test Case Number " + this.countTestCases());
		System.out.println("Test Case Name = "+ this.getName());
	      System.out.println("Updated Test Case Name = "+ this.getName() + "Update");
		
	}
	@Test
	public void testSub(){
		
		assertEquals(70,Calculation.sub(10, 80));	
		
		System.out.println("Test Case Number " + this.countTestCases());
		System.out.println("Test Case Name = "+ this.getName());
	      System.out.println("Updated Test Case Name = "+ this.getName() + "Update");

		
	}
	//tearDown used to close the connection or clean up activities
	public void tearDown(){
		
	}
}
