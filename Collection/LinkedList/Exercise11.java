package com.demo;
import java.util.*;

import javax.print.DocFlavor.STRING;
public class App 
{
    public static void main( String[] args )
    {
    	LinkedList<String>list=new LinkedList<String>();
    	list.add("Mumbai");
    	list.add("Pune");
    	list.add("Nashik");
    	list.add("Satara");
    	list.add("Solapur");
    	System.out.println("Original list: "+list);
    	
    	for(int i=0;i<list.size();i++)
    	{
    		System.out.println("Element at index "+i+": "+list.get(i));
    	}
    }
}