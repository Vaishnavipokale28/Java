package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	LinkedList<String> list = new LinkedList<String>();
    	list.add("Pune");
    	list.add("Aurangabad");
    	list.add("Dhule");
    	list.add("Mumbai");
    	list.add("Nashik");
    	Iterator p = list.listIterator(2);
    	while(p.hasNext()) {
    		System.out.println(p.next());
    	}
    	
    }
}