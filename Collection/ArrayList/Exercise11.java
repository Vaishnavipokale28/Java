package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	List<String>list = new ArrayList<String>();
    	list.add("Vaishnavi");
    	list.add("Anushree");
    	list.add("Shruti");
    	list.add("Sanvi");
    	list.add("Sakshi");
    	System.out.println("Before Reversing: "+list);
    	Collections.reverse(list);
    	System.out.println("After Reversing: "+list);
    }
}