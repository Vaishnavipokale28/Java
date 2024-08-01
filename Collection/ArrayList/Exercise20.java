package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<String>list= new ArrayList<String>(2);
    	list.add("Vaishnavi");
    	list.add("Anushree");
    	System.out.println("Original array: "+list);
    	list.ensureCapacity(4);
    	list.add("Shruti");
    	list.add("Sanvi");
    	System.out.println("New List: "+list);
    }
}