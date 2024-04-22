class Demo3 extends Demo2
{
	Demo3()
	{	super(10);
		System.out.println("default const of Demo3");
	}
	Demo3(int a)
	{
		System.out.println("para const of demo3");
	}
	int a=100,b=200;
	void display()
	{
		System.out.println("display method of Demo3");
		System.out.println("a="+a+"b="+b);
	}
}