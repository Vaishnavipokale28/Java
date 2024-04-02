/*
input:{165,198,12,89,25,57,235,84,127}
output:[516, 819, 21, 98, 52, 75, 523, 48, 712]
*/

import java.util.Arrays;
class Program18
{
	public static void main(String arg[])
	{
		
		int a[]={165,198,12,89,25,57,235,84,127};
		for(int i=0;i<a.length;i++)
		{
			int last=a[i]%10,length=0;
			a[i]/=10;
			int temp=a[i];
			while(temp!=0)
			{
				length++;
				temp/=10;
			}
			last*=Math.pow(10,length);
			a[i]+=last;
		}
		System.out.println(Arrays.toString(a));
	}
}