package com.qainfotech.junit.junitTesting;

import java.util.ArrayList;


public class App 
{
	public ArrayList<String> check(ArrayList<String> array){
		ArrayList<String> a=new ArrayList<String>();
		for(int i=0;i<array.size();i++) {
			int j;
			for(j=1;j<array.get(i).length();j++) {
				if(array.get(i).charAt(j)==array.get(i).charAt(j-1)) {
					a.add(array.get(i));
					break;
				}
			}
		}
		return a;
		
	}
	
    public static void main( String[] args )
    {
        ArrayList<String> list=new ArrayList<String>();
        list.add("apple");
        list.add("qait");
        list.add("hello");
        ArrayList<String> result=new ArrayList<String>();
        App obj=new App();
        		result=obj.check(list);
        System.out.println(result);
    }
}
