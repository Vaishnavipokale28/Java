import java.util.Arrays;
class Program21
{
	public static void main(String arg[])
	{
		int a[]={10,83,18,24,95,12,63,28};
		int max=a[0];
		for(int i=1;i<a.length;i++)
			if(max<a[i])
				max=a[i];
			System.out.println("Max="+max);

	}
}
