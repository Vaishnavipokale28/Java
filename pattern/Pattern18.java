class Pattern18
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print((char)(j+96));
			}
			System.out.println();
		}	
	}
	
}