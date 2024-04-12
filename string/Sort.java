/*
Input: Vaishnavi
Output:aahiinsvv
*/
import java.util.Arrays;
import java.util.Scanner;
class Sort
{
	public static void main(String args[])
	{	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String: ");
		String s1=sc.nextLine();
		System.out.println(s1);
		char ch[]=s1.toCharArray();
		Arrays.sort(ch);
		StringBuilder sb= new StringBuilder(new String(ch));
		System.out.println(sb);
		
	}
}




