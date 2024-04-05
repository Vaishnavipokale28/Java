import java.util.Arrays;
class Program22
{
	public static void main(String arg[])
	{
		int a[]={10,83,18,24,95,12,63,28,82};
		int max=a[0];
		int sMax=0;
		for(int i=1;i<a.length;i++)
			if(max<a[i])
			{
				sMax=max;
				max=a[i];
			}
			else
				if(sMax<a[i]&& a[i]!=max)
					sMax=a[i];
			System.out.println("Max="+max);
			System.out.println("Second Max="+sMax);

	}
}
