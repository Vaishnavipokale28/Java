/*
Input: Welcome to international airport
Output:Weelcom to ilnternationa atirpor

*/
import java.util.Arrays;
import java.util.Scanner;
class Shift4
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
		String temp=s2[i];
		sb.append(temp.charAt(0));
		if(temp.length()>1)
		{
			sb.append(temp.charAt(temp.length()-1));
			sb.append(temp.substring(1,temp.length()-1));
		}
		if(i<s2.length-1)
			sb.append(" ");
		}
		System.out.println(sb);		
					
	}
}




