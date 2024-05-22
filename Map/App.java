package com.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class App {

	public static void main(String[] args)
	{
		Map<String,String> m = new HashMap();
		m.put("v","Vaishnavi");
		m.put("a","atharva");
		m.put("m","mira");
		m.put("s","sanvi");
		m.put("k", "khushi");
		m.put(null, "nothing");
		
		System.out.println(m);
		
		System.out.println(m.get("a"));
		
		Set<String> set = m.keySet();
		for(String s:set)
		{
			System.out.println(s+"\t"+m.get(s));
		}
		
		System.out.println("--------------------------");
		Set<Entry<String,String>> set1 = m.entrySet();
		Iterator<Entry<String,String>> itr = set1.iterator();
		while(itr.hasNext())
		{
			Entry<String,String> e = itr.next();
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
		
		System.out.println("---------------------------");
		System.out.println(m.containsKey("m"));
		System.out.println("---------------------------");
		System.out.println(m.containsValue("Vaishnavi"));
		System.out.println("---------------------------");
		System.out.println(m.size());
		System.out.println("---------------------------");
		m.remove("k");
		System.out.println(m);
		
		
		
	}	
}
