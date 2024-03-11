class Program5
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n;i++)
		{
			for(int j=i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=((n-i+1)*2)-1;j++)
			{
				if(j%2==0)
					System.out.print((char)(i+96));
				else
					System.out.print((char)(i+64));	
			}
			System.out.println();
		}
	}
}