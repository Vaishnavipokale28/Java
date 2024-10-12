package com.demo;
import java.util.*;
import java.util.Iterator;

public class App {
    public static void main(String args[])
    {
    	HashSet<String>hset=new HashSet<String>();
    	hset.add("Pune");
    	hset.add("Aurangabad");
    	hset.add("Mumbai");
    	hset.add("Nashik");
    	hset.add("Solapur");
    	System.out.println("Original HashSet Contains: "+hset);
    	
    	hset.clear();
    	
    	System.out.println("HashSet content: "+hset);
    	
    	
    }
}

