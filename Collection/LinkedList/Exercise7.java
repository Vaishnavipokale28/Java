package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	LinkedList<String>list= new LinkedList<String>();
    	list.add("Pink");
    	list.add("Red");
    	list.add("Orange");
    	System.out.println("Original List: "+list);
    	
    	list.offerFirst("Black");
    	System.out.println("Linked List: "+list);
    }
}