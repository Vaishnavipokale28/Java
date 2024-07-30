package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	LinkedList<String>list= new LinkedList<String>();
    	list.add("Red");
    	list.add("orange");
    	list.add("green");
    	System.out.println("Original list: "+list);
    	list.addFirst("Pink");
    	list.addLast("White");
    	System.out.println("List after adding new element at first and at last: "+list);
    }
}