import java.util.Arrays;
class Program25
{
	public static void main(String arg[])
	{
		int a[]={10,23,18,24,19,12,63,28,82,15,4,21,38};
		int b[]=new int[a.length-1];
		for(int i=0;i<a.length-1;i++)
			b[i]=Math.abs(a[i]-a[i+1]);
		System.out.println(Arrays.toString(b));
	}
}
