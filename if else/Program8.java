class Program8
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int count=1;
			for(int j=i;j>=1;j--)
			{
				if(j%2==0)
					System.out.print((char)(j/2+64));
				else
					System.out.print(1);
			}
			System.out.println();
		}
	}
}