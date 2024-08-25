package com.demo;
import java.util.*;
import java.util.Iterator;

public class App {
    public static void main(String args[])
    {
    	TreeSet<String>tset= new TreeSet<String>();
    	tset.add("red");
    	tset.add("Pink");
    	tset.add("Blue");
    	tset.add("Black");
    	tset.add("White");
    	for(String s: tset) {
    		System.out.println(s);
    	}
    	
    }
}
