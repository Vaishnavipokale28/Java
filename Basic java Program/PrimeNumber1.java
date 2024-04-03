import java.util.Arrays;
class PrimeNumber1
{
	public static void main(String arg[])
	{
		int a=0,count=0,last=62;
		while(true)
		{
			boolean b=false;
			if(a==0|a==1)
				b=true;
			else
				for(int i=2;i<=a/2;i++)
					if(a%i==0)
					{
						b=true;
						break;
					}
				if(!b)
					count++;
				if(count==last)
				{
					System.out.println(last+"th prime number is "+a);
					break;
				}
				a++;
		}
	}
}