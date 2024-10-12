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
    	System.out.println("First hash Set Content: "+hset);
    	
    	HashSet<String>hset2= new HashSet<String>();
    	hset2.add("Pune");
    	hset2.add("Nagpur");
    	hset2.add("Mumbai");
    	hset2.add("Nanded");
    	System.out.println("Second hash set Content: "+hset);
    	hset.retainAll(hset2);
    	System.out.println("HashSet comtent: ");
    	System.out.println(hset);
    }
}

