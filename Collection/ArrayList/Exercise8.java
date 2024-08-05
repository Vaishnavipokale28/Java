package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	List<String>list= new ArrayList<String>();
    	list.add("Vaishnavi");
    	list.add("Atharva");
    	list.add("Shruti");
    	list.add("Anushree");
    	list.add("Rutik");
    	System.out.println("List before the sorting: "+list);
    	Collections.sort(list);
    	System.out.println("List after the Sorting: "+list);
    }
}