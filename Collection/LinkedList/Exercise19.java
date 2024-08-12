package com.demo;
import java.util.*;

import javax.print.DocFlavor.STRING;
public class App 
{
    public static void main( String[] args )
    {
    	LinkedList<String>list= new LinkedList<String>();
    	list.add("Pink");
    	list.add("Red");
    	list.add("Orange");
    	list.add("Black");
    	list.add("White");
    	System.out.println("Original List: "+list);
    	
    	System.out.println("Removed Element: "+list.pop());
    	
    	System.out.println("Linked List after pop operation: "+list);
    }
}