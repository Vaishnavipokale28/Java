/*

123454321
1234 4321
123   321
12     21
1       1
12     21
123   321
1234 4321
123454321

*/

class Pattern68
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n*2-1;i++)
		{
			if(i<=n)
			{
				if(i==1)
				{
					for(int j=1;j<=n;j++)
						System.out.print(j);
					for(int j=n-1;j>=i;j--)
						System.out.print(j);
				}
				else
				{
					for(int j=1;j<=n-i+1;j++)
						System.out.print(j);
					for(int j=1;j<=i*2-3;j++)
						System.out.print(" ");
					for(int j=n-i+1;j>=1;j--)
						System.out.print(j);
				}
			}
			else
			{
				if(i==n*2-1)
				{
					for(int j=1;j<=n;j++)
						System.out.print(j);
					for(int j=n-1;j>=1;j--)
						System.out.print(j);	
				}
				else
				{	
					for(int j=1; j<=i-n+1; j++)
						System.out.print(j);
					for(int j=1; j<=(n*2-i)*2-3; j++)
						System.out.print(" ");
					for(int j=i-n+1; j>=1; j--)
						System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}