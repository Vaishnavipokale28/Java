package com.demo;
import java.util.*;
import java.util.Iterator;

public class App {
    public static void main(String args[])
    { 
    	PriorityQueue<String> p= new PriorityQueue<String>();
    	p.add("Vaishnavi");
    	p.add("Atharva");
    	p.add("Sanvi");
    	p.add("Samarth");
    	p.add("Sakshi");
    	
    	System.out.println(" Priority Queue: "+p);
    	
    	
    	System.out.println("Size of the Priority Queue: "+p.size());
    	
    }
 }


