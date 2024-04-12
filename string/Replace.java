import java.util.Scanner;
class Replace
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s1=sc.nextLine();
		System.out.println(s1);
		int count=1;
		String s2="AEIOUaeiou";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s1.length();i++)
			if(s2.contains(String.valueOf(s1.charAt(i))))
				sb.append(count++);
			else
				sb.append(s1.charAt(i));
			System.out.println(sb);		
	}
}