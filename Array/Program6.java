import java.util.Arrays;
class Program6
{
	public static void main(String arg[])
	{
		int a[]={10,20,30,40,50};
		int temp=a[0];
		for(int i=1;i<a.length;i++)
			a[i-1]=a[i];
		a[a.length-1]=temp;
		System.out.println(Arrays.toString(a));				
	}
}