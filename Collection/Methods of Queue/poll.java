package com.practice;

import java.util.concurrent.ArrayBlockingQueue;

public class poll {

	public static void main(String args[])
	{
		ArrayBlockingQueue q = new ArrayBlockingQueue(3);
		q.add(10);
		q.add(20);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q);
		
	}
}
