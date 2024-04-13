/*
Input: i am java developer
Output:8 7m j6v5 d4v3l2p1r

*/
import java.util.Scanner;
class Replace3
{
	public static void main(String args[])
	{	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter string: ");		
		String s1=sc.nextLine();
		System.out.println(s1);
		StringBuilder sb= new StringBuilder(s1);	
		int count=0; 
		String vowels="AEIOUaeiou";
		for(int i=sb.length()-1;i>=0;i--)
			if(vowels.contains(String.valueOf(sb.charAt(i))))
			{
				sb.deleteCharAt(i);
				sb.insert(i,++count);
			}
		System.out.println(sb);
						
					
	}
}




