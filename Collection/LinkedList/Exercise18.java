package com.demo;
import java.util.*;

import javax.print.DocFlavor.STRING;
public class App 
{
    public static void main( String[] args )
    {
    	LinkedList<String>list= new LinkedList<String>();
    	list.add("Sunday");
    	list.add("Monday");
    	list.add("Tuesday");
    	list.add("Wednesday");
    	list.add("Wednesday");
    	System.out.println("Original List: "+list);
    	
    	LinkedList<String>list1= new LinkedList<String>();
    	list1= (LinkedList)list.clone();
    	System.out.println("Cloned List: "+list1);
    }
}