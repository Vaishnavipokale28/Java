import java.util.Arrays;
class PrimeandTwist
{
	public static void main(String arg[])
	{
		int n=13;
		boolean b=false;
		if(n==0||n==1)
			b=true;
		else
			for(int i=2;i<=n/2;i++)
				if(n%i==0)
				{
					b=true;
					break;
				}
		if(!b)
		{
			int n1=n,sum=0;
			while(n1!=0)
			{
				sum*=10;
				sum+=n1%10;
				n1/=10;
			}
			if(sum==0||sum==1)
				b=true;
			else
				for(int j=2;j<=sum/2;j++)
					if(sum%j==0)
					{
						b=true;
						break;
					}
			if(!b)
				System.out.println(n+" is prime and twist number");
			
		}else
				System.out.println(n+" is not prime and twist number");

	}
}
