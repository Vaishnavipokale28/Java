/*
input:{165,198,12,89,25,57,235,84,127}
output:[16512, 19818, 123, 8917, 257, 5712, 23510, 8412, 12710]
*/

import java.util.Arrays;
class Program16
{
	public static void main(String arg[])
	{
		
		int a[]={165,198,12,89,25,57,235,84,127};
		for(int i=0;i<a.length;i++)
		{
			int sum=0,length=0,temp=a[i];
			while(temp!=0)
			{
				sum+=temp%10;
				temp/=10;
			}
			temp=sum;
			while(temp!=0)
			{
				length++;
				temp/=10;
			}
			a[i]*=Math.pow(10,length);
			a[i]+=sum;

		}
		System.out.println(Arrays.toString(a));
	}
}