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
    	
    	Set<String>keys = treeMap.keySet();
    	for(String key:keys) {
    		System.out.println(key);
    	}
    }	
}
 
