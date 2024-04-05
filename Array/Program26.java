import java.util.Arrays;
class Program26
{
	public static void main(String arg[])
	{
		int a[]={10,23,18,24,19,12,63,28,82,15,4,21,38};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		int min=a[a.length-1];
		for(int i=0;i<a.length-1;i++)
		{
			int diff=Math.abs(a[i]-a[i+1]);
			if(min>diff && diff!=0)
				min=diff;
		}
		for(int i=0;i<a.length-1;i++)
		{
			int diff=Math.abs(a[i]-a[i+1]);
				if(diff==min)
					System.out.println(a[i]+"\t"+a[i+1]);	
		}
		
	}
}
