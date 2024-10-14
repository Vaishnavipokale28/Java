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
    	if(treeMap.containsValue("Green")) {
    		System.out.println("The Tree Map contains key Green");
    	}
    	else {
    		System.out.println("The tree map does not contains key Green");
  
    	}
    	if(treeMap.containsValue("Pink")) {
    		System.out.println("The tree map contains key Pink");
    	}else {
    		System.out.println("The TreeMap does not contains key Pink");
    	}
    }	
}
 
