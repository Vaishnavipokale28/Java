/*
555555555
 4444444
  33333
   222
    1

*/

class Program16
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>1;j--)
				System.out.print(" ");
			for(int j=1;j<=(n-i+1)*2-1;j++)
				System.out.print(n-i+1);
			System.out.println();
		}
	}
}