package com.demo;
import java.util.*;
import java.util.Iterator;

public class App {
 
	public static void main(String args[])
	{
		PriorityQueue<String> p= new PriorityQueue<String>();
		p.add("Red");
		p.add("Pink");
		p.add("Black");
		p.add("Orange");
		System.out.println("First Priority Queue: "+p);
		
		PriorityQueue<String> p1 = new PriorityQueue<String>();
		p1.add("Red");
		p1.add("Green");
		p1.add("Black");
		p1.add("White");
		System.out.println("Second Priority Queue: "+p1);
		
		for(String s : p) {
			System.out.println(p1.contains(s) ? "Yes" : "No");
		}
	}
 }


