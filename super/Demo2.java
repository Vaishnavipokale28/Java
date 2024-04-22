class Demo2
{
	Demo2()
	{
		System.out.println("default const of demo2");
	}
	Demo2(int a)
	{
		System.out.println("para const of Demo2");
	}
	int a=10,b=20;
	void display()
	{
		System.out.println("display method of demo2");
		System.out.println("a="+a+"b="+b);
	}
}