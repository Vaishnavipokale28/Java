package com.demo;
import java.util.*;
import java.util.Iterator;

public class App {
    public static void main(String[] args)
    {
    	HashSet<String> hset = new HashSet<String>();
    	hset.add("Red");
    	hset.add("Yellow");
    	hset.add("Pink");
    	hset.add("Blue");
    	
    	HashSet<String> hset1= new HashSet<String>();
    	hset1.add("Red");
    	hset1.add("White");
    	hset1.add("Pink");
    	hset1.add("Blue");
    	
    	HashSet<String> h = new HashSet<String>();
    	for(String s: hset) {
    		System.out.println(hset1.contains(s)?"Yes":"No");
    	}
    }	
}
