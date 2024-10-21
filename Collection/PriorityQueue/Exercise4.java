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
    	
    	System.out.println("Original Priority Queue: "+p);
    	
    	p.offer("Sakshi");
    	
    	System.out.println("The new Priority Queue: "+p);
    	
    }
 }


