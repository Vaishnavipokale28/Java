package com.demo;
import java.util.*;

import javax.print.DocFlavor.STRING;
public class App 
{
    public static void main( String[] args )
    {
    	LinkedList<String>list= new LinkedList<String>();
    	list.add("Vaishnavi");
    	list.add("Shruti");
    	list.add("Anushree");
    	list.add("Atharva");
    	list.add("Samarth");
    	System.out.println("Original list: "+list);
    	Collections.shuffle(list);
    	System.out.println("Shuffle List: "+list);
    }
}