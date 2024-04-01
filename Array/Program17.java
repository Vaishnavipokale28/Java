/*
input:{165,198,12,89,25,57,235,84,127}
output:[12165, 18198, 312, 1789, 725, 1257, 10235, 1284, 10127]
*/

import java.util.Arrays;
class Program17
{
	public static void main(String arg[])
	{
		
		int a[]={165,198,12,89,25,57,235,84,127};
		for(int i=0;i<a.length;i++)
		{
			int sum=0,length=0,temp=a[i];
			while(temp!=0)
			{
				length++;
				sum+=temp%10;
				temp/=10;
			}
			sum*=Math.pow(10,length);
			a[i]+=sum;

		}
		System.out.println(Arrays.toString(a));
	}
}