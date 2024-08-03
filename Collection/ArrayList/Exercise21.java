package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<String>list=new ArrayList<String>();
    	list.add("Pink");
    	list.add("Red");
    	list.add("Green");
    	System.out.println("Original List: "+list);
    	String newColor="Black";
    	list.set(1, newColor);
    	
    	int n=list.size();
    	System.out.println("Replace second element with 'black': ");
    	for(int i=0;i<n;i++)
    		System.out.println(list.get(i));
    }
}