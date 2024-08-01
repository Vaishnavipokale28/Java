package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
     List<String>list= new ArrayList<String>();
     list.add("Vaishnavi");
     list.add("Shruti");
     list.add("Anushree");
     for(String element:list) {
    	 System.out.println(element);
     }
    }
}