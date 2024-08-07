package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	LinkedList<String>list= new LinkedList<String>();
    	list.add("Rose");
    	list.add("Lotus");
    	list.add("lily");
    	list.add("sunflower");
    	System.out.println("Original LinkedList: "+list);
    	System.out.println("Let add the Mogra after the Lotus: " );
    	list.add(2,"Mogra");
    	System.out.println("The Linked List: "+ list);
    }
}