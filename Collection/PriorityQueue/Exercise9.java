package com.demo;
import java.util.*;
import java.util.Iterator;

public class App {
 
	public static void main(String args[])
	{
		 PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();  
	      
	   pq1.add(18);
	   pq1.add(22);
	   pq1.add(30);
	   pq1.add(25);
	   pq1.add(96);
	   pq1.add(70);
	   pq1.add(82);
	   pq1.add(89);
	   pq1.add(14);
	   System.out.println("Original Priority Queue: "+pq1);
	   System.out.println("The first element of the Queue: "+pq1.poll());
	   System.out.println("Priority Queue after removing element: "+pq1);
	}
 }


