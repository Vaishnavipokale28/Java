package com.demo;
import java.util.*;
import java.util.Iterator;

public class App {
    public static void main(String args[])
    { 
    	PriorityQueue<String> q1= new PriorityQueue<String>();
    	q1.add("Pune");
    	q1.add("Sambhajinagar");
    	q1.add("Mumbai");
    	System.out.println("Priority Queue 1: "+q1);
    	
    	PriorityQueue<String> q2= new PriorityQueue<String>();
    	q2.add("Nashik");
    	q2.add("Solapur");
    	q2.add("Dhule");
    	System.out.println("Priority Queue 2: "+q2);
    	
    	q1.addAll(q2);
    	System.out.println("New Priority Queue: "+q1);
    }
 }


