import java.util.Arrays;
class PrimeNumber
{
	public static void main(String arg[])
	{
		int n=7;
		boolean b=false;
		if(n==0||n==1)
			b=true;
		else
			for(int i=2;i<n/2;i++)
			{
				if(n%i==0)
				{
					b=true;
					break;
				}
				if(!b)
					System.out.println(n+" is prime number");
				else
					System.out.println(n+" is not prime number");
			}
	}
}