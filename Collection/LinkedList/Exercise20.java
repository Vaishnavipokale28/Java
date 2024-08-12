package com.demo;
import java.util.*;

import javax.print.DocFlavor.STRING;
public class App 
{
    public static void main( String[] args )
    {
    	LinkedList<String>list= new LinkedList<String>();
    	list.add("Vaishnavi");
    	list.add("Sanvi");
    	list.add("Sakshi");
    	list.add("Anushree");
    	list.add("Shruti");
    	System.out.println("Original List: "+list);
    	
    	String s = list.peekFirst();
    	
    	System.out.println("First element in the list: "+s);
    	
    	System.out.println("Original List: "+list);
    }
}