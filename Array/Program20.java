/*
input:{8429,81772,812,19332,827,29364,1083,8234533,93,294443,64}
output:[2489, 12778, 128, 12339, 278, 23469, 138, 2333458, 39, 234449, 46]
*/

import java.util.Arrays;
class Program20
{
	public static void main(String arg[])
	{
		
		int a[]={8429,81772,812,19332,827,29364,1083,8234533,93,294443,64};
		for(int i=0;i<a.length;i++)
		{
			int count=0,temp=a[i];
			while(temp!=0)
			{
				temp/=10;
				count++;		
			}
			int b[]=new int[count];
			for(int j=0;j<b.length;j++)
			{
				b[j]=a[i]%10;
				a[i]/=10;	
			}
			{
				int sum=0;
				Arrays.sort(b);
				for(int j=0;j<b.length;j++)
				{
					sum*=10;
					sum+=b[j];
				}
				a[i]=sum;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}