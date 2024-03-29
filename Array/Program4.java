class Program4
{
	public static void main(String arg[])
	{
		int a[]={21,39,24,22,91,12,81,19,36};
		double oddavg=0;
		int oddcount=0;
		for(int i=0;i<a.length;i++)
		
			if(a[i]%2!=0)
			{
				oddavg+=a[i];
				oddcount++;
			}
		oddavg+=oddcount;
		System.out.println(oddavg);
		
	}
}