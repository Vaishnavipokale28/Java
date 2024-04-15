/*
Input:  hello i am java developer
Output: Hello I Am Java Developer

*/
import java.util.Arrays;
import java.util.Scanner;
class Uppercase
{
	public static void main(String args[])
	{	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter string: ");
		String s1=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			sb.append(Character.toUpperCase(s2[i].charAt(0)));
			sb.append(s2[i].substring(1));
			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}




