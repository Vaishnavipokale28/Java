package com.demo;
import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args)
    {
    	HashSet<String>hset= new HashSet<String>();
    	hset.add("Cricket");
    	hset.add("football");
    	hset.add("Badminton");
    	hset.add("SoftBall");
    	hset.add("Tabletennis");
    	System.out.println("HashSet: "+hset);
    	
    	String[]new_array=new String[hset.size()];
    	hset.toArray(new_array);
    	
    	System.out.println("New Array: ");
    	for(String s:new_array) {
    		System.out.println(s);
    	}
    }
}
