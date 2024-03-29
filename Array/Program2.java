class Program2
{
	public static void main(String arg[])
	{
		int a[]={21,39,24,22,91,12};
		int avg=0;
		for(int i=0;i<a.length;i++)
			avg+=a[i];
			avg/=a.length;
		System.out.println("Average="+avg);
	}
}