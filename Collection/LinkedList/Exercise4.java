package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	LinkedList<String>list = new LinkedList<String>();
    	list.add("Vaishnavi");
    	list.add("Atharva");
    	list.add("Sanvi");
    	list.add("Disha");
    	
    	System.out.println("Original List: "+list);
    	
    	Iterator  i = list.descendingIterator();
    	System.out.println("\nElements in reverse order: ");
    	while(i.hasNext()) {
    		System.out.println(i.next());
    	}
    }
}