package com.demo;
import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args)
    {
    	HashSet<String>hset= new HashSet<String>();
    	hset.add("Monday");
    	hset.add("Tuesday");
    	hset.add("Wednesday");
    	hset.add("Thursday");
    	hset.add("Friday");
    	System.out.println("HashSet: "+hset);
    	
    	hset.removeAll(hset);
    	
    	System.out.println("HashSet after removing all the elements: "+hset);
    }
}
