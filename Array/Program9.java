import java.util.Arrays;
class Program9
{
	public static void main(String arg[])
	{
		int a[]={10,20,30,40,50};
		a[0]+=a[a.length-1];
		a[a.length-1]=a[0]-a[a.length-1];
		a[0]-=a[a.length-1];
		System.out.println(Arrays.toString(a));			
	}
}