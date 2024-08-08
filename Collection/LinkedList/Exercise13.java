package com.demo;
import java.util.*;

import javax.print.DocFlavor.STRING;
public class App 
{
    public static void main( String[] args )
    {
    	LinkedList<String>list= new LinkedList<String>();
    	list.add("Vaishnavi");
    	list.add("Atharva");
    	list.add("Sukanya");
    	list.add("Sanvi");
    	list.add("Samarth");
    	System.out.println("Original list: "+list);
    	
    	Object firstElement = list.removeFirst();
    	System.out.println("Element remove: "+firstElement);
    	
    	Object lastElement= list.removeLast();
    	System.out.println("Element remove: "+lastElement);
    	
    	System.out.println("After removing first and last element: "+list);
    	
    }
}