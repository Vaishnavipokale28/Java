/*
Input: where is nayan and nitin
Output:nayan
       nitin
*/
import java.util.Arrays;
import java.util.Scanner;
class Palindrome1
{
	public static void main(String args[])
	{	
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter String: ");
			String s1=sc.nextLine();
			String s2[]=s1.split(" ");
			for(int i=0;i<s2.length;i++)
				if((s2[i]).equalsIgnoreCase(new StringBuilder(s2[i]).reverse().toString()))
				{
					System.out.println(s2[i]);	
				}
	}
}




