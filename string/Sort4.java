/*
Input: Vaishnavi
Output:aiaiVhnsv
*/
import java.util.Arrays;
import java.util.Scanner;
class Sort4
{
	public static void main(String args[])
	{	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String: ");
		String s1=sc.nextLine();
		System.out.println(s1);
		String s2="AEIOUaeiou";
		StringBuilder sb= new StringBuilder();
		StringBuilder vowels= new StringBuilder();
		for(int i=0;i<s1.length();i++)
			if(s2.contains(String.valueOf(s1.charAt(i))))
				sb.append(s1.charAt(i));
			else
				vowels.append(s1.charAt(i));
		char c1[]=vowels.toString().toCharArray();
		Arrays.sort(c1);
		sb.append(new String(c1));
		System.out.println(sb);
		
	}
}




