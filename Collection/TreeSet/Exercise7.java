package com.demo;
import java.util.*;
import java.util.Iterator;

public class App {
    public static void main(String args[])
    {
    	TreeMap<String, String> treeMap = new TreeMap<String,String>(new sort_key());
    	
    	treeMap.put("c1","Sanvi");
    	treeMap.put("c2", "Vaishnavi");
    	treeMap.put("c3","Atharva");
    	treeMap.put("c4","Samarth");
    	
    	System.out.println(treeMap);
    }	
}

class sort_key implements Comparator<String>{
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
}
 
