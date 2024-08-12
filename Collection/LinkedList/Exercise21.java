package com.demo;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("pen");
        list.add("paper");
        list.add("pencil");
        list.add("scale");
        list.add("sharpner");

        System.out.println("Original list: " + list);
        
        String x = list.peekLast();
        System.out.println("Last element of list: "+x);
        
        System.out.println("Original Linked List: "+list);
        
    }
}
