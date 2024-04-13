/*
Input: i am java developer
Output:am developer i java

*/
import java.util.Arrays;
import java.util.Scanner;
class Sort6
{
	public static void main(String args[])
	{	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter string: ");		
		String s1=sc.nextLine();
		System.out.println(s1);
		String s2[]=s1.split(" ");
		Arrays.sort(s2);
		StringBuilder sb= new StringBuilder();	
		for(int i=0;i<s2.length;i++)
		{
			sb.append(s2[i]);
			if(i<s2.length-1)
				sb.append(" ");
		}	
		System.out.println(sb);		
	}
}




