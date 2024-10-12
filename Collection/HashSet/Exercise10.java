package com.demo;
import java.util.*;
import java.util.Iterator;

public class App {
    public static void main(String args[])
    {
    	HashSet<String>hset= new HashSet<String>();
    	hset.add("Red");
    	hset.add("Blue");
    	hset.add("Black");
    	hset.add("White");
    	
    	HashSet<String>hset1=new HashSet<String>();
    	hset1.add("Red");
    	hset1.add("Pink");
    	hset1.add("Black");
    	hset1.add("Orange");
    	
    	HashSet<String>result = new HashSet<String>();
    	for(String s :hset) {
    		System.out.println(hset1.contains(s)? "Yes":"No");
    	}
    	)
    }
}

