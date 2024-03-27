class MainClass1
{
	public static void main(String args[])
	{
		Demo1 d1 = new Demo1();
		Demo1 d2 = new Demo1();
		d1.a=10;
		d1.b=100;
		System.out.println("d1.a="+d1.a);
		System.out.println("d1.b="+d1.b);
		System.out.println("d2.a="+d2.a);
		System.out.println("d2.b="+d2.a);
		d1.m1();
	}
}
