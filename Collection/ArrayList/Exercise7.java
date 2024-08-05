package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    List<String>list= new ArrayList<String>();
    list.add("red");
    list.add("green");
    list.add("yellow");
    list.add("orange");
    if(list.contains("green")) {
    	System.out.println("Element found");
    }
    else {
    	System.out.println("Element not found");
    }
    }
}