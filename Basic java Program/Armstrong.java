import java.util.Arrays;
class Armstrong
{
	public static void main(String arg[])
	{
		int n=153,n1=n,sum=0,length=0;
		while(n1!=0)
		{
			n1/=10;
			length++;
		}
		n1=n;
		while(n1!=0)
		{
			sum+=Math.pow(n1%10,length);	
			n1/=10;
		}
		if(sum==n)
			System.out.println(n+" is armstrong number");
		else
			System.out.println(n+" is not armstrong number");
	}
}
