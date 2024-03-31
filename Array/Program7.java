import java.util.Arrays;
class Program7
{
	public static void main(String arg[])
	{
		int a[]={10,20,30,40,50};
		int temp=a[a.length-1];
		for(int i=a.length-2; i>0;i--)
			a[i+1]=a[i];
		a[0]=temp;
		System.out.println(Arrays.toString(a));			
	}
}