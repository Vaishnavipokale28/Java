package com.demo;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    List<String>list= new ArrayList<String>();
    list.add("Mango");
    list.add("Apple");
    list.add("Orange");
    list.add("Banana");
    list.add("Pineapple");
    System.out.println(list);
    String element=list.get(0);
    System.out.println("First Element: "+element);
    element=list.get(2);
    System.out.println("Third Element: "+element);
    }
}