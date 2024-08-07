package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	LinkedList<String>list=new LinkedList<String>();
    	list.add("Vaishnavi");
    	list.add("Atharva");
    	list.add("Sanvi");
    	System.out.println("Original List: "+list);
    	list.offerLast("Samarth");
    	System.out.println("List after adding element at last: "+list);
    }
}