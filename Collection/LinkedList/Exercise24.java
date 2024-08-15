package com.demo;
import java.util.*;

public class App {
    public static void main(String[] args)
    {
      LinkedList<String>list1= new LinkedList<String>();
      list1.add("Vaishnavi");
      list1.add("Vaishali");
      list1.add("Shruti");
      list1.add("Atharva");
      System.out.println("List 1: "+list1);
      
      LinkedList<String>list2= new LinkedList<String>();
      list2.add("Sanvi");
      list2.add("Vaishnavi");
      list2.add("Anushree");
      list2.add("Atharva");
      list2.add("Disha");
      System.out.println("List 2: "+list2);
      
      LinkedList<String>list3= new LinkedList<String>();
      for(String s:list1)
    	  list3.add(list2.contains(s) ? "yes":"no");
      System.out.println(list3);
    }
}
