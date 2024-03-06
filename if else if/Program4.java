class Program4
{
	public static void main(String args[])
	{
		int n=10;
		for(int i=1;i<=n;i++)
			if(i%4==0)
				continue;
			else
				System.out.println(i);
	}
}