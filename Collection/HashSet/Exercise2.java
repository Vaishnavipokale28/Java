package com.demo;
import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args)
    {
    	HashSet<String>hset= new HashSet<String>();
    	hset.add("Pink");
    	hset.add("Yellow");
    	hset.add("Green");
    	hset.add("Black");
    	System.out.println("HashSet: "+hset);
    	
    	Iterator<String>p = hset.iterator();
    	
    	while(p.hasNext()) {
    		System.out.println(p.next());
    	}
    }
}
