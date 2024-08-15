package com.demo;
import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args)
    {
    	HashSet<String> hset = new HashSet<String>();
    	hset.add("Vaishnavi");
    	hset.add("Shruti");
    	hset.add("Anushree");
    	hset.add("Sanvi");
    	hset.add("Disha");
    	System.out.println("HashSet: "+hset);
    	
    	System.out.println("Size of HashSet: "+hset.size());
    }
}
