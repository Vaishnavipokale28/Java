class  Program42
{
	public static void main(String args[])
	{
		int n=5;
		int count=(n*(n+1))/2;//10
		for(int i=n;i>=1;i--)//4>=1
		{
			
			for(int j=i;j<1;j++)//5<5
			{
				System.out.print("\t");
			}
			for(int j=i;j>=1;j--)//<=5
			{
				System.out.print(count+"\t");
				count--;
			}
			System.out.println();
			
		}
	}
}