class Program3
{
	public static void main(String arg[])
	{
		int a[]={21,39,24,22,91,12,81,19,36};
		int avg=0;
		for(int i=0;i<a.length;i++)
			avg+=a[i];
			avg/=a.length;
		System.out.println("Average="+avg);
		for(int i=0;i<a.length;i++)
			if(a[i]>avg)
				System.out.println(a[i]);
	}
}