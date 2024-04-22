class Demo4 extends Demo3
{
	Demo4()
	{
		
		System.out.println("default const of Demo4");
	}
	Demo4(int a)
	{
		System.out.println("para const of Demo4");
	}
	int a=1000,b=2000;
	void display()
	{
		System.out.println("display method of Demo4");
		System.out.println("a="+super.a+"b="+super.b);
		super.display();
	}
}