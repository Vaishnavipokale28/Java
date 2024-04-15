/*
Input:  welcome to 2024
Output:8

*/
import java.util.Arrays;
import java.util.Scanner;
class Practice
{
	public static void main(String args[])
	{	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter string: ");
		String s1=sc.nextLine();
		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isDigit(s1.charAt(i)))
				sum+=Character.getNumericValue(s1.charAt(i));
		
		}
		System.out.println(sum);
	}
}




