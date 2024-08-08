package com.demo;
import java.util.*;

import javax.print.DocFlavor.STRING;
public class App 
{
    public static void main( String[] args )
    {
    	LinkedList<String>list=new LinkedList<String>();
    	list.add("Pink");
    	list.add("Green");
    	list.add("Yellow");
    	list.add("Red");
    	list.add("Orange");
    	list.add("Black");
    	System.out.println("Original List: "+list);
    	Collections.swap(list, 0, 4);
    	System.out.println("After Swapping List: "+list);
    }
}