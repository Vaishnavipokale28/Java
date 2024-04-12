/*Input: Vaishnavi
OutPut:Vshnvaiai
*/

import java.util.Scanner;
class Replace1
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s1=sc.nextLine();
		System.out.println(s1);
		StringBuilder sb=new StringBuilder();
		String s2="AEIOUaeiou";
		StringBuilder vowels=new StringBuilder();
		for(int i=0;i<s1.length();i++)
			if(!s2.contains(String.valueOf(s1.charAt(i))))
				sb.append(s1.charAt(i));
			else
				vowels.append(s1.charAt(i));
			sb.append(vowels);
			System.out.println(sb);		
	}
}




