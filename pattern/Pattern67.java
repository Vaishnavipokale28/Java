/*

5       5
44     44
333   333
2222 2222
111111111
2222 2222
333   333
44     44
5       5

*/

class Pattern67
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=(n*2)-1;i++)
		{
			if(i<=n)
			{
				if(i==n)
				{
					for(int j=1;j<=(n*2)-1;j++)
						System.out.print(n-i+1);
				}
				else
				{
					for(int j=i;j>=1;j--)
						System.out.print(n-i+1);
					for(int j=1;j<=(n-i+1)*2-3;j++)
						System.out.print(" ");
					for(int j=i;j>=1;j--)
						System.out.print(n-i+1);
				}
				
			}
			else
			{
				for(int j=i; j<=n*2-1; j++)
					System.out.print(i-n+1);
				for(int j=1; j<=(i-n+1)*2-3; j++)
					System.out.print(" ");
				for(int j=i; j<=n*2-1; j++)
					System.out.print(i-n+1);

			}
			System.out.println();
		}	
	}
}