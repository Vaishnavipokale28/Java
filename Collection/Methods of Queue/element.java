package com.practice;

import java.util.concurrent.ArrayBlockingQueue;

public class element {

	public static void main(String args[])
	{
		ArrayBlockingQueue q = new ArrayBlockingQueue(3);
		q.add(90);
		q.add(80);
		q.add(70);
		System.out.println(q.element());
		System.out.println(q);
		
		
	}
}
