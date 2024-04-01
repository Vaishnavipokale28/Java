/*
input:{18,22,17,24,23,26,19,25,43,44,14,65,29,30}
output:[18, 22, 7, 24, 6, 26, 5, 4, 3, 44, 14, 2, 1, 30]
*/

import java.util.Arrays;
class Program14
{
	public static void main(String arg[])
	{
		
		int a[]={18,22,17,24,23,26,19,25,43,44,14,65,29,30};
		int count=1;
		for(int i=a.length-1;i>0;i--)30>0
		{
			if(a[i]%2!=0)
				a[i]=count++;
		}
		System.out.println(Arrays.toString(a));
	}
}