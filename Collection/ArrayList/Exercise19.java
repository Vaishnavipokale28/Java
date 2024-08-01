package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<String>list= new ArrayList<String>();
    	list.add("Red");
    	list.add("Pink");
    	list.add("White");
    	list.add("Black");
    	list.add("Blue");
    	list.add("Violet");
    	System.out.println("List : "+list);
    	System.out.println("trim to size the above array: ");
    	list.trimToSize();
    	System.out.println(list);
    }
}