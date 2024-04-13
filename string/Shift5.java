/*
Input: welcome to international airport
Output:wlcmeoe to ntrntnlieaioa rprtaio

*/
import java.util.Arrays;
import java.util.Scanner;
class Shift5
{
	public static void main(String args[])
	{	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter string: ");
		String s1=sc.nextLine();
		System.out.println(s1);
		StringBuilder sb= new StringBuilder();
		String s2[]=s1.split(" ");
		String vowels="AEIOUaeiou";
		for(int i=0;i<s2.length;i++)
		{
			StringBuilder temp=new StringBuilder();
			for(int j=0;j<s2[i].length();j++)
				if(vowels.contains(String.valueOf(s2[i].charAt(j))))
					temp.append(s2[i].charAt(j));
				else
					sb.append(s2[i].charAt(j));
		sb.append(temp);
		if(i<s2.length-1)
			sb.append(" ");
					
		}
		System.out.println(sb);
				
					
	}
}




