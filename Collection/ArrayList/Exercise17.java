package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<String>list = new ArrayList<String>();
    	list.add("Monday");
    	list.add("Tuesday");
    	list.add("Wednesday");
    	list.add("Thursday");
    	list.add("Friday");
    	System.out.println("List Of days: "+list);
    	list.removeAll(list);
    	System.out.println("List after removing all elements: "+list);
    }
}