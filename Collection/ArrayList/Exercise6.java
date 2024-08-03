package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    List<String>list= new ArrayList<String>();
    list.add("Pune");
    list.add("Aurangabad");
    list.add("Mumbai");
    list.add("Nashik");
    list.add("Nanded");
    list.add("Dhule");
    System.out.println(list);
    list.remove(1);
    System.out.println(list);
    
    }
}