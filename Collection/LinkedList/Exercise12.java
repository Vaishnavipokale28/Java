package com.demo;
import java.util.*;

import javax.print.DocFlavor.STRING;
public class App 
{
    public static void main( String[] args )
    {
    	LinkedList<String>list=new LinkedList<String>();
    	list.add("Pink");
    	list.add("Red");
    	list.add("White");
    	list.add("Orange");
    	list.add("Yellow");
    	System.out.println("Original list: "+list);
    	list.remove(2);
    	System.out.println("New Likned List: "+list);
    }
}