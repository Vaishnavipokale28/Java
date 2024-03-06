class Program2
{
	public static void main(String args[])
	{
		int a=10, b=50, c=60, d=400, e=300;
		if(a>b)
			if(a>c)
				if(a>d)
					if(a>e)
						System.out.println("a is greater");
					else
						System.out.println(" e is greater");
				else
					if(d>e)
						System.out.println("d is greater");
					else
						System.out.println("e is greater"); 
				
			else
				if(c>d)
					if(c>e)
						System.out.println("c is greater");
					else
						System.out.println("e is greater");
				else
					if(d>e)
						System.out.println("d is greater");
					else
						System.out.println("e is greater");
		else
			if(b>c)
				if(b>d)
					if(b>e)
						System.out.println("b is greater");
					else
						System.out.println("e is greater");
				else
					if(d>e)
						System.out.println("d is greater");
					else
						System.out.println("e is greater");
			else
				if(c>d)
					if(c>e)
						System.out.println(" c is greater");
					else
						System.out.println("e is greater");
				else
					if(d>e)
						System.out.println("d is greater");
					else
						System.out.println(" e is greater");
					
	
	}
}