package com.practice;

import java.util.concurrent.ArrayBlockingQueue;

public class peek {

	public static void main(String args[])
	{
		ArrayBlockingQueue q = new ArrayBlockingQueue(3);
		q.add(10);
		q.add(20);
		System.out.println(q.peek());
		System.out.println(q);
		
	}
}
