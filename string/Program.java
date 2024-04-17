import java.util.Arrays;
import java.util.Scanner;
class Program
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String1: ");
		String s1=sc.nextLine();
		System.out.print("Enter String2: ");
		String s2=sc.nextLine();
		if(s1.equals(s2))
		{
			System.out.println("The string are lexicographically equal.");
		}
		else
		{
			int result=s1.compareTo(s2);
			
			if(result<0)
			{
				System.out.println("The first string is lexicographically smaller than the second string.");
			}
			else if (result > 0) 
			{
              		 	System.out.println("The first string is lexicographically larger than the second string.");
           		} 
			else 
			{
                		System.out.println("The strings are lexicographically equal.");
            		}
		}
								
	}
}




