/*
Input: Welcome to international airport
Output:international

*/
import java.util.Arrays;
import java.util.Scanner;
class Longest
{
	public static void main(String args[])
	{	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String: ");
		String s1=sc.nextLine();
		System.out.println(s1);
		StringBuilder sb= new StringBuilder();
		String s2[]=s1.split(" ");
		int max=0;
		for(int i=0;i<s2.length;i++)
			if(max<s2[i].length())
				max=s2[i].length();
		for(int i=0;i<s2.length;i++)
			if(max==s2[i].length())
				System.out.println(s2[i]);
		
					
	}
}




