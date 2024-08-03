package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    List<String> list = new ArrayList<String>();
    list.add("Vaishnavi");
    list.add("Shruti");
    list.add("Anushree");
    list.add("Atharva");
    System.out.println(list);
    list.set(3,"Sanvi");
    System.out.println(list);
    
    }
}