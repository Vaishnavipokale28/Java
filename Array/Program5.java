class Program5
{
	public static void main(String arg[])
	{
		int a[]={21,39,24,22,91,12,81,19,36};
		double oddavg=0;
		double evenavg=0;
		int oddcount=0;
		int evencount=0;
		for(int i=0;i<a.length;i++)
			if(a[i]%2!=0)
			{
				oddavg+=a[i];
				oddcount++;
			}
			else
			{
				evenavg+=a[i];
			}
		oddavg/=oddcount;
		evenavg/=(a.length-oddcount);
		System.out.println(evenavg);
		System.out.println(oddavg);
		
	}
}