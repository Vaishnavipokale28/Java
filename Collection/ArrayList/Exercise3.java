package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
     List<String>list= new ArrayList<String>();
     list.add("Pune");
     list.add("Mumbai");
     list.add("Chh.Sambhajinagar");
     list.add("Nashik");
     System.out.println(list);
     list.add(0,"Nagpur");
     System.out.println(list);
     list.add(5,"Nanded");
     System.out.println(list);
    }
}