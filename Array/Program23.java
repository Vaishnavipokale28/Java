import java.util.Arrays;
class Program23
{
	public static void main(String arg[])
	{
		int a[]={10,83,18,24,95,12,63,28,82,15,4,21,38,43,52,64,89,16,7,};
		int sum=28;
		for(int i=0;i<a.length-1;i++)
			for(int j=i+1;j<a.length;j++)
				if(sum==a[i]+a[j])
					System.out.println(a[i]+"\t"+a[j]);
	}
}
