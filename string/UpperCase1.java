import java.util.Scanner;
import java.util.Arrays;
class UpperCase1
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String1: ");
		String s1=sc.nextLine();
		String a=s1.toUpperCase();
		System.out.println("String in UpperCase: "+a);		
	}
}