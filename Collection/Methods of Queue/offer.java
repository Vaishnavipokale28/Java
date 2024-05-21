package com.practice;

import java.util.concurrent.ArrayBlockingQueue;

public class offer {

	public static void main(String args[])
	{
		ArrayBlockingQueue q=new ArrayBlockingQueue(3);
		q.add(20);
		q.add(10);
		q.add(30);
		System.out.println(q.offer(40));
		System.out.println(q);
	}
}
