import java.util.Arrays;
class Palindrome2
{
	public static void main(String arg[])
	{
		int a=0,count=0,last=78;
		while(true)
		{
			int temp=a,sum=0;
			while(temp!=0)
			{
				sum*=10;
				sum+=temp%10;
				temp/=10;
			}
			if(sum==a)
				count++;
			if(count==last)
			{
				System.out.println(last+"th palindrome number is "+a);
				break;
			}
			a++;
		}	
	}
}