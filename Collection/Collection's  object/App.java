package com.demo;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;
public class App 
{
    public static void main( String[] args )
    {
        ArrayList <Integer> list = new  ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println("-----------");
        for(int i=0;i<list.size();i++)
        	System.out.println(list.get(i));
        System.out.println("-----------");
        for(int a:list)
        	System.out.println(a);
        System.out.println("---------");
        Iterator<Integer> itr= list.iterator();
        while(itr.hasNext())
        	System.out.println(itr.next());
        System.out.println("---------");
        ListIterator<Integer> litr=list.listIterator(list.size());
        while (litr.hasPrevious())
        	System.out.println(litr.previous());
        System.out.println("--------");
        list.forEach(a->System.out.println(a));
    }
}
