package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<String>list=new ArrayList<String>();
    	list.add("Pink");
    	list.add("Red");
    	list.add("Green");
    	list.add("Blue");
    	System.out.println("Original List: "+list);
    	
    	System.out.println("\n print using index of an element: ");
    	int n=list.size();
    	for(int i=0;i<n;i++)
    		System.out.println(list.get(i));
    	
    	
    }
}