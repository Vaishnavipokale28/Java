class pattern27
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(count+"\t");
				count++;
			}
			System.out.println();
		}

	}
}
    
   


