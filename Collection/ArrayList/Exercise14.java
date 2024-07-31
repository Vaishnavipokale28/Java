package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<String>list= new ArrayList<String>();
    	list.add("Vaishnavi");
    	list.add("Anushree");
    	list.add("Shruti");
    	list.add("Sanvi");
    	list.add("Sanskruti");
    	System.out.println("List before the swap: "+list);
    	
    	Collections.swap(list, 1, 4);
    	System.out.println("List after the swap: "+list);
    	
    }
}