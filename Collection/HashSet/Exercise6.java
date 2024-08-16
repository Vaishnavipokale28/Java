package com.demo;
import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args)
    {
    	HashSet<String>hset= new HashSet<String>();
    	hset.add("Red");
    	hset.add("Blue");
    	hset.add("White");
    	hset.add("Ornage");
    	hset.add("Violet");
    	System.out.println("Original HashSet: "+hset);
    	
    	HashSet<String>new_hset= new HashSet<String>();
    	new_hset=(HashSet)new_hset.clone();
    	System.out.println("Cloned HashSet: "+hset);
    	
    	}
}
