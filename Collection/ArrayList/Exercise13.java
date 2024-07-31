package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	List<String>list1= new ArrayList<String>();
    	list1.add("Red");
    	list1.add("pink");
    	list1.add("Yellow");
    	list1.add("Orange");
    	list1.add("Green");
    	System.out.println("List 1: "+list1);
    	
    	List<String>list2= new ArrayList<String>();
    	list2.add("Red");
    	list2.add("Pink");
    	list2.add("Black");
    	list2.add("Green");
    	list2.add("Orange");
    	System.out.println("List 2: "+list2);
    	
    	List<String>list= new ArrayList<String>();
    	for(String e:list1)
    		list.add(list2.contains(e)? "yes":"no");
    	System.out.println(list);
    }
}