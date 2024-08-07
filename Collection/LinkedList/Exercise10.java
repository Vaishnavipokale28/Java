package com.demo;
import java.util.*;

import javax.print.DocFlavor.STRING;
public class App 
{
    public static void main( String[] args )
    {
    	LinkedList<String>list=new LinkedList<String>();
    	list.add("Vaishnavi");
    	list.add("Shrti");
    	list.add("Anushree");
    	System.out.println("Original List: "+list);
    	
    	Object FirstElement = list.getFirst();
    	System.out.println("First Element: "+FirstElement);
    	
    	Object LastElement = list.getLast();
    	System.out.println("Last Element: "+LastElement);
    }
}