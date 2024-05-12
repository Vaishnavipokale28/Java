class MainClass11
{
	public static void main(String args[])
	{
		Site s = new Site();
		User u1 = new User(s);
		User u2 = new User(s);
		User u3 = new User(s);
		User u4 = new User(s);
		Thread t1 = new Thread(u1);
		Thread t2 = new Thread(u2);
		Thread t3 = new Thread(u3);
		Thread t4 = new Thread(u4);
		t1.setName("Shruti");
		t2.setName("Vaishnvai");
		t3.setName("Anushree");
		t4.setName("Sanvi");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println(t1.isAlive());
		try{
		Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println(t1.isAlive());
		
		
	}
}