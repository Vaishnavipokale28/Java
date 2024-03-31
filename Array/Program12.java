import java.util.Arrays;
class Program12
{
	public static void main(String arg[])
	{
		int a[]={10,20,30,40,50};
		for(int i=0;i<a.length/2;i++)
		{
			a[i]+=a[a.length-i-1];
			a[a.length-i-1]=a[i]-a[a.length-i-1];
			a[i]-=a[a.length-i-1];
		}
		System.out.println(Arrays.toString(a));
	}
}