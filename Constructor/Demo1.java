class Demo1
{
	int a,b;
	static int c;
	void display()
	{
		System.out.println("a="+a+"b="+b);
	}
	Demo1()
	{
		a=10;
		b=20;
		System.out.println("default constructor called");
	}
	Demo1(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("user defined constructor called ");
	}
}