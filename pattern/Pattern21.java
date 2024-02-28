class Pattern21
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)//2<=5
		{
			for(int j=i;j<n;j++)//2<5
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)// 0>=1
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
    
   


