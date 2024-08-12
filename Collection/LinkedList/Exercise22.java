package com.demo;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
       
    	LinkedList<String>list = new LinkedList<String>();
    	list.add("Red");
    	list.add("Pink");
    	list.add("Green");
    	list.add("orange");
    	list.add("Blue");
    	System.out.println("Original Linked List: "+list);
    	
    	if(list.contains("Green")) {
    		System.out.println("List contains Green color.");
    	}
    	else {
    		System.out.println("List doesn't contain Green color.");
    	}
    	
    	if(list.contains("Black")) {
    		System.out.println("List contains Black color.");
    	}
    	else {
    		System.out.println("List doesn't contain Black color.");
    	}
    	
    }
}
