import java.util.Arrays;
class Practice
{
	public static void main(String arg[])
	{
		int a[]={10,20,30,40,50};
		for(int i=a.length-2;i>=0;i--)
		{
			a[i]+=a[i+1];
			a[i+1]=a[i]-a[i+1];
			a[i]-=a[i+1];
		}
		System.out.println(Arrays.toString(a));
	}
}