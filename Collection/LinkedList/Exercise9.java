package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	LinkedList<String>list=new LinkedList<String>();
    	list.add("Pune");
    	list.add("Mumbai");
    	list.add("Nagpur");
    	System.out.println("Original List: "+list);
    	
    	LinkedList<String>list1=new LinkedList<String>();
    	list1.add("Nashik");
    	list1.add("Nanded");
    	
    	list.addAll(1, list1);
    	System.out.println("LinkedList: "+list);
    }
}