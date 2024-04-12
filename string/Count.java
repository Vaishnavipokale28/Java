/*
Input: Hello I am Java developer

Output:5
*/
import java.util.Arrays;
import java.util.Scanner;
class Count
{
	public static void main(String args[])
	{	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String: ");
		String s1=sc.nextLine();
		System.out.println(s1);
		String s2[]=s1.split(" ");
		int count=0;
		for(int i=0;i<s2.length;i++)
			if(!s2[i].isEmpty())
				count++;
		System.out.println(count);
		
	}
}




