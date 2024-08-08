package com.demo;
import java.util.*;

import javax.print.DocFlavor.STRING;
public class App 
{
    public static void main( String[] args )
    {
    	LinkedList<String>list=new LinkedList<String>();
    	list.add("Pune");
    	list.add("Mumbai");
    	list.add("Solapur");
    	list.add("Satara");
    	System.out.println("List 1: "+list);
    	
    	LinkedList<String>list1= new LinkedList<String>();
    	list1.add("Kolhapur");
    	list1.add("Sangli");
    	list1.add("Nanded");
    	System.out.println("List 2: "+list1);
    	
    	LinkedList<String>list2= new LinkedList<String>();
    	list2.addAll(list);
    	list2.addAll(list1);
    	System.out.println("New LinkedList: "+list2);
    	
    	
    }
}