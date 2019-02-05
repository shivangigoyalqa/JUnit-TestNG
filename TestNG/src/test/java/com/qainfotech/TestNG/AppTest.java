package com.qainfotech.TestNG;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AppTest 
   
{
    @Test
    public void TestExample() {
	App a1 = new App();
    ArrayList<String> list=new ArrayList<String>();
    list.add("");
    list.add("qait");
    list.add("hello");
    ArrayList<String> result=new ArrayList<String>();
    result.add("apple");
    result.add("hello");
    
    Assert.assertEquals(result,a1.check(list),"Failed");
}
}