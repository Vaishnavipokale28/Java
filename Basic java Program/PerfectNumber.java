
import java.util.Arrays;
class PerfectNumber
{
	public static void main(String arg[])
	{
		int n=28,sum=0;
		for(int i=1;i<n;i++)
			if(n%i==0)
				sum+=i;
		if(sum==n)
			System.out.println(n+" is perfect number");
		else
			System.out.println(n+" is not perfect number");
			
	}
}