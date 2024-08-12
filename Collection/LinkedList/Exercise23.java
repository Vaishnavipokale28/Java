package com.demo;
import java.util.*;

public class App {
    public static void main(String[] args)
    {
       LinkedList<String>linkedlist= new LinkedList<String>();
       linkedlist.add("pune");
       linkedlist.add("mumbai");
       linkedlist.add("Nashik");
       linkedlist.add("solapur");
       System.out.println("Original linkedList: "+linkedlist);
       
       List<String>list= new ArrayList<String>(linkedlist);
       
       for(String s: list)
    	   System.out.println(s);
       
    }
}
