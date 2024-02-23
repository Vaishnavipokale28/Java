class Program7
{
	public static void main(String args[])
	{ 
		int n=3;
		for(int l=1; l<=n; l++)
		{
			for(int k=1; k<=n; k++)
			{
				for(int j=1; j<=n; j++)
				{
					for(int i=1; i<=n; i++)
					{
         					System.out.print("*");
					}	
					System.out.print(" ");
				}
				System.out.println();
			}
			System.out.println();	
		}
	}
}