/*

123454321
 1234321
  12321
   121
    1
   121
  12321
 1234321
123454321

*/

class Program20
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n*2-1; i++)
		{
			if(i<=n)
			{
				for(int j=i; j>1; j--)
					System.out.print(" ");
				for(int j=1; j<=n-i+1; j++)
					System.out.print(j);
				for(int j=(n-i+1)-1; j>=1; j--)
					System.out.print(j);
			}
			else
			{
				for(int j=i; j<n*2-1; j++)
					System.out.print(" ");
				for(int j=1; j<=i-n+1; j++)
					System.out.print(j);
				for(int j=(i-n+1)-1; j>=1; j--)
					System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}