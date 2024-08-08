package com.demo;
import java.util.*;

import javax.print.DocFlavor.STRING;
public class App 
{
    public static void main( String[] args )
    {
    	LinkedList<String>list=new LinkedList<String>();
    	list.add("Apple");
    	list.add("Mango");
    	list.add("Banana");
    	list.add("Pineapple");
    	list.add("Orange");
    	System.out.println("Original List: "+list);
    	list.clear();
    	System.out.println("New list: "+list);
    	
    }
}