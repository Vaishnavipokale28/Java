package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	LinkedList<String>list = new LinkedList<String>();
    	list.add("apple");
    	list.add("Mango");
    	list.add("Chiku");
    	list.add("Banana");
    	list.add("orange");
    	for(String e : list)
    		System.out.println(e);
    	
    }
}