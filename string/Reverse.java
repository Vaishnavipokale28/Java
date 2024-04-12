/*
Input: Hello I am Java Developer
Output:olleH I ma avaj repoleved

*/
import java.util.Arrays;
import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String: ");
		String s1=sc.nextLine();
		System.out.println(s1);
		StringBuilder sb= new StringBuilder();
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			sb.append(new StringBuilder(s2[i]).reverse());
			if(i<s2.length-1)
				sb.append(" ");
		}	
		System.out.println(sb);	
					
	}
}




