/*
Input: Welcome to international airport
Output:elcome o nternational irport Wtia

*/
import java.util.Arrays;
import java.util.Scanner;
class Shift6
{
	public static void main(String args[])
	{	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter string: ");		
		String s1=sc.nextLine();
		StringBuilder sb= new StringBuilder();	
		String s2[]=s1.split(" ");
		StringBuilder temp=new StringBuilder();
		for(int i=0;i<s2.length;i++)
		{
			sb.append(s2[i].substring(1));
			temp.append(s2[i].charAt(0));
			sb.append(" ");
		}
		sb.append(temp);
		System.out.println(sb);
						
					
	}
}




