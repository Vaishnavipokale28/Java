package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	List<String>list= new ArrayList<String>();
    	list.add("Pune");
    	list.add("Mumbai");
    	list.add("Nashik");
    	list.add("Nagpur");
    	list.add("Naded");
    	System.out.println("Original List: "+list);
    	List<String>sub_string=list.subList(0, 3);
    	System.out.println("Sub String: "+sub_string);
    }
}