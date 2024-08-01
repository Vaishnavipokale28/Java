package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<String>list= new ArrayList<String>();
    	list.add("Mango");
    	list.add("Apple");
    	list.add("Banana");
    	list.add("chiku");
    	System.out.println("Original Array: "+list);
    	
    	ArrayList<String> list1=(ArrayList<String>)list.clone();
    	System.out.println("cloned Array list: "+list1);
    }
}