/*
    1
   212
  32123
 4321234
543212345
 4321234
  32123
   212
    1
*/
class Program19
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n*2-1; i++)
		{
			if(i<=n)
			{
				for(int j=i; j<n; j++)
					System.out.print(" ");
				for(int j=i; j>=1; j--)
					System.out.print(j);
				for(int j=n/2; j<=i; j++)
					System.out.print(j);
			}
			else
			{
				for(int j=i; j>n; j--)
					System.out.print(" ");
				for(int j=n*2-i; j>=1; j--)
					System.out.print(j);
				for(int j=n/2; j<=n*2-i; j++)
					System.out.print(j);
			}
			System.out.println(" ");	
		}
	}
}