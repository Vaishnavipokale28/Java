class  Pattern38
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;//2
		for(int i=1;i<=n;i++)//1<=5
		{
			for(int j=i;j>1;j--)//1>1
			{
				System.out.print("\t");
			}
			for(int j=i;j<=n;j++)//0>=1
			{
				System.out.print(count+"\t");
				count++;
			}
			System.out.println();
			
		}
	}
}