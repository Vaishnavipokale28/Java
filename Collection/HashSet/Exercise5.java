package com.demo;
import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args)
    {
    	HashSet<String>hset= new HashSet<String>();
    	hset.add("Rose");
    	hset.add("Lotus");
    	hset.add("Lily");
    	hset.add("Sunflower");
    	System.out.println("HashSet: "+hset);
    	System.out.println("Check HashSet is Empty or Not: "+hset.isEmpty());
    	hset.removeAll(hset);
    	System.out.println("After Removing all the elements from the hash Set: "+hset);
    	System.out.println("Check HashSet is Empty or Not: "+hset.isEmpty());
    }
}
