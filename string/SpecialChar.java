/*
Input:   Hello!! how are you????
Output:  Hello how are you

*/
import java.util.Arrays;
import java.util.Scanner;
class SpecialChar
{
	public static void main(String args[])
	{	
		

			Scanner sc= new Scanner(System.in);
			System.out.print("Enter string: ");
			String s1=sc.nextLine();
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<s1.length();i++)
			{
				if(Character.isLetterOrDigit(s1.charAt(i))||(Character.isWhitespace(s1.charAt(i))))
				sb.append(s1.charAt(i));
			}
			System.out.println(sb);
	}
}




