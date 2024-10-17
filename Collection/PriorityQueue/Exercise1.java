package com.demo;
import java.util.*;
import java.util.Iterator;

public class App {
    public static void main(String args[])
    {
    	PriorityQueue<String> queue = new PriorityQueue<String>();
    	queue.add("Red");
    	queue.add("Purple");
    	queue.add("Black");
    	queue.add("Green");
    	System.out.println("Element of the Priority queue: "+queue);
    }	
}


