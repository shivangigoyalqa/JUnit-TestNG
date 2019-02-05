package com.qainfotech.junit.junitTesting;

import java.util.ArrayList;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest 
    
{
	@Test
   public void Testexample() {

   App a1 = new App();
    ArrayList<String> list=new ArrayList<String>();
    list.add("apple");
    list.add("qait");
    list.add("hello");
    ArrayList<String> result=new ArrayList<String>();
    result.add("apple");
    result.add("hello");
    
    assertEquals("Failed",result,a1.check(list));
    
    
}
	
	@Test
	   public void TestIntegerexample() {

	   App a1 = new App();
	    ArrayList<String> list=new ArrayList<String>();
	    list.add("119");
	    list.add("123");
	    list.add("445");
	    ArrayList<String> result=new ArrayList<String>();
	    
	    assertEquals("String should only contain alphabets",a1.check(list));
	    
	    
	}

	@Test
	   public void TestEmptyexample() {

	   App a1 = new App();
	    ArrayList<String> list=new ArrayList<String>();
	    
	    ArrayList<String> result=new ArrayList<String>();
	    
	    assertEquals("List should not be empty",a1.check(list));
	    
	    
	}
}