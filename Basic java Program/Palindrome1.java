
import java.util.Arrays;
class Palindrome1
{
	public static void main(String arg[])
	{
		int n=1221,n1=n,sum=0;
		while(n1!=0)
		{
			sum*=10;
			sum+=n1%10;
			n1/=10;
		}
		if(sum==n)
			System.out.println(n+" is palindrom number");
		else
			System.out.println(n+" is not palindrom number");	
	}
}