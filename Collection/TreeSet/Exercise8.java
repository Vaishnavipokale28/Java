package com.demo;
import java.util.*;
import java.util.Iterator;

public class App {
    public static void main(String args[])
    {
    	TreeMap<String, String> treeMap = new TreeMap<String,String>();
    	
    	treeMap.put("c1","Sanvi");
    	treeMap.put("c2", "Vaishnavi");
    	treeMap.put("c3","Atharva");
    	treeMap.put("c4","Samarth");
    	
    	System.out.println("Orginal TreeMap content: " + treeMap);
    	  System.out.println("Greatest key: " + treeMap.firstEntry());
    	  System.out.println("Least key: " + treeMap.lastEntry());
    }	
}


