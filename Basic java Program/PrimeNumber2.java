import java.util.Arrays;
class PrimeNumber2
{
	public static void main(String arg[])
	{
		int a=1,count=0,last=25,b[]=new int[last];
		while(true)
		{
			if(Math.sqrt(a)%1==0)
				b[b.length-1-count++]=a;
			if(count==last)
				break;
			a++;		
		}
		System.out.println(Arrays.toString(b));
	}
}
