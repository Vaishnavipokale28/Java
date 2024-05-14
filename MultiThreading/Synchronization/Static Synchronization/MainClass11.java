class MainClass11
{
	public static void main(String args[])
	{
		Site s = new Site();
		Site s1 = new Site();
		User u1 = new User(s);
		User u2 = new User(s);
		User u3 = new User(s1);
		User u4 = new User(s1);
		Thread t1 = new Thread(u1);
		Thread t2 = new Thread(u2);
		Thread t3 = new Thread(u3);
		Thread t4 = new Thread(u4);
		t1.setName("Vaishnavi");
		t2.setName("Atharva");
		t3.setName("Sanvi");
		t4.setName("Mira");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}