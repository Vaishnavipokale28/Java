/*
Input: Vaishnavi
Output:aahiinsvv
*/
import java.util.Arrays;
import java.util.Scanner;
class Sort2
{
	public static void main(String args[])
	{	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String: ");
		String s1=sc.nextLine();
		System.out.println(s1);
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length-1;i++)
			for(int j=i+1;j<ch.length;j++)
				if(ch[i]>ch[j])
				{	
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
		StringBuilder sb= new StringBuilder(new String(ch));
		System.out.println(sb);
		
	}
}




