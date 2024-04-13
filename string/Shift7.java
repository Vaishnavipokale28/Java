/*
Input: Welcome to international airport
Output:wlcmtnt rn tnlrprteoeoie aioaaio

*/
import java.util.Arrays;
import java.util.Scanner;
class Shift7
{
	public static void main(String args[])
	{	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter string: ");		
		String s1=sc.nextLine();
		StringBuilder sb= new StringBuilder();	
		StringBuilder vowels=new StringBuilder();
		String temp="AEIOUaeiou";
		for(int i=0;i<s1.length();i++)
		{
			if(temp.contains(String.valueOf(s1.charAt(i))))
				vowels.append(s1.charAt(i));
			else 
				if(s1.charAt(i)!=' ')
				sb.append(s1.charAt(i));	
		}
		sb.append(vowels);
		for(int i=0;i<s1.length();i++)
			if(s1.charAt(i)==' ')
				sb.insert(i,' ');
		
		System.out.println(sb);
						
					
	}
}




