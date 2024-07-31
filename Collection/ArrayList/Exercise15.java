package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<String>list1= new ArrayList<String>();
    	list1.add("Pune");
    	list1.add("Mumbai");
    	list1.add("Nashik");
    	list1.add("Nanded");
    	System.out.println("List 1: "+list1);
    	
    	ArrayList<String>list2= new ArrayList<String>();
    	list2.add("Satara");
    	list2.add("Nagpur");
    	list2.add("Solapur");
    	list2.add("Beed");
    	System.out.println("List 2: "+list2);
    	
    	ArrayList<String>list = new ArrayList<String>();
    	list.addAll(list1);
    	list.addAll(list2);
    	System.out.println("New Array: "+list);
    	
    }
}