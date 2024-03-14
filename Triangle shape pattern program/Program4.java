/*

5
54
543
5432
54321
5432
543
54
5


*/

class Program3
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=(n*2)-1;i++)//1<=9
		{
			if(i<=n)
			{
				for(int j=n;j>=(n-i)+1;j--)//4>=1
					System.out.print(j);
			}
			else
			{
				for(int j=n;j>=(i-n)+1;j--)//5>=5
					System.out.print(j);
			}
			System.out.println();		
		}
	}
}

