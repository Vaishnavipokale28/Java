import java.util.Arrays;
class Program8
{
	public static void main(String arg[])
	{
		int a[]={10,20,30,40,50};
		int temp=a[0];
		for(int i=0;i<a.length;i++)
			a[0]=a[a.length-1];
		a[a.length-1]=temp;
		System.out.println(Arrays.toString(a));			
	}
}