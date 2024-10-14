package com.demo;
import java.util.*;
import java.util.Iterator;

public class App {
    public static void main(String args[])
    {
    	TreeMap<String, String> treeMap = new TreeMap<String,String>();
    	
    	treeMap.put("c1", "Red");
    	treeMap.put("c2", "Green");
    	treeMap.put("c3", "Black");
    	treeMap.put("c4", "White");
    	
    	System.out.println(treeMap);
    	if(treeMap.containsKey("c1")) {
    		System.out.println("The Tree Map contains key c1");
    	}
    	else {
    		System.out.println("The tree map does not contains key c1");
  
    	}
    	if(treeMap.containsKey("c5")) {
    		System.out.println("The tree map contains key c5");
    	}else {
    		System.out.println("The TreeMap does not contains key c5");
    	}
    }	
}
 
