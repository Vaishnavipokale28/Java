class Program6
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
					System.out.print(count++);
				else
					System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}
}