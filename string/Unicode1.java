import java.util.Arrays;
import java.util.Scanner;
class Unicode1
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s1=sc.nextLine();
		System.out.print("Enter index number to find unicode: ");
		int a=sc.nextInt();
		if(a>0&&a<s1.length())
		{
			int unicode=s1.codePointBefore(a);
			System.out.println("unicode value at index "+a+" is: "+unicode);
		}
		else
			System.out.println("Invalid Index!!");
		
						
	}
}




