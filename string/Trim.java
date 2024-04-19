import java.util.Scanner;
import java.util.Arrays;
class Trim
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String1: ");
		String s1=sc.nextLine();
		String a=s1.trim();
		System.out.println("New String: "+a);		
	}
}