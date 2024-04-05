import java.util.Arrays;
class Program24
{
	public static void main(String arg[])
	{
		int a[]={10,23,18,24,19,12,63,28,82,15,4,21,38,43,52,64,14,16,7,42,34,31,37,46};
		int sum=48;
		for(int i=0;i<a.length-2;i++)
			for(int j=i+1;j<a.length-1;j++)
				for(int k=j+1;k<a.length;k++)
					if(sum==a[i]+a[j]+a[k])
					System.out.println(a[i]+"\t"+a[j]+"\t"+a[k]);
	}
}
