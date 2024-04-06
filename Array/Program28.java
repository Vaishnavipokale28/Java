import java.util.Arrays;
class Program28
{
	public static void main(String args[])
	{
		int a[]={14,18,34,65,17,44,24,28,9,11,21};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
		if(a[i]%4==0 && a[i]%10==4)
			b[i]=-3;
		else if(a[i]%10==4)
			b[i]=-2;
		else if(a[i]%4==0)
			b[i]=-1;
		else
			b[i]=a[i];	
		}
		System.out.println(Arrays.toString(b));		 	
	}
}
