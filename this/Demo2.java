class Demo2
{
	int a=10,b=20;
	void m1()
	{
		int a=100,b=200;
		System.out.println(this);
		System.out.println("a="+this.a+"b="+this.b);
	}

	Demo2()
	{
		this(10);
		System.out.println("default const called");
	}

	Demo2(int a)
	{
		System.out.println("para const called");
	}
}