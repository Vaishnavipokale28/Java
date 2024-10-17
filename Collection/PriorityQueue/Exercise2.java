package com.demo;
import java.util.*;
import java.util.Iterator;

public class App {
    public static void main(String args[])
    { 
    	PriorityQueue<String>queue= new PriorityQueue<String>();
    	queue.add("Vaishnavi");
    	queue.add("Sakshi");
    	queue.add("Sanvi");
    	queue.add("Prachi");
    	System.out.println("Elements of the priority queue: ");
    	
    	for(String e: queue) {
    		System.out.println(e);
    	}
    }
 }


