package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	List<String>list=new ArrayList<String>();
    	list.add("Red");
    	list.add("Pink");
    	list.add("Yellow");
    	list.add("Orange");
    	list.add("Green");
    	System.out.println("List before shuffling: "+list);
    	Collections.shuffle(list);
    	System.out.println("List After shuffling: "+list);
    	
    }
}