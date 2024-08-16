package com.demo;
import java.util.*;
import java.util.Iterator;

public class App {
    public static void main(String[] args)
    {
    	HashSet<String>hset= new HashSet<String>();
    	hset.add("Pink");
    	hset.add("green");
    	hset.add("Purple");
    	hset.add("Red");
    	hset.add("Black");
    	System.out.println("HashSet: "+hset);
    	
    	Set<String>Tree_set= new TreeSet<String>(hset);
    	
    	System.out.println("TreeSet Elements: "+Tree_set);
    	for(String s: Tree_set)
    		System.out.println(s);
    	
    }
}
