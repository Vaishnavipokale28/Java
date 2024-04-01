/*
input:{165,198,12,89,25,57,235,84,127}
output:[12, 18, 3, 17, 7, 12, 10, 12, 10]
*/

import java.util.Arrays;
class Program15
{
	public static void main(String arg[])
	{
		
		int a[]={165,198,12,89,25,57,235,84,127};
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			while(a[i]!=0)
			{
				sum+=a[i]%10;
				a[i]/=10;
			}
			a[i]=sum;
		}
		System.out.println(Arrays.toString(a));
	}
}