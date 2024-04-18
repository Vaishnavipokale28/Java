import java.util.Arrays;
import java.util.Scanner;
class EndsWith
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s1=sc.nextLine();
		System.out.print("Enter ending of String: ");
		String s2=sc.nextLine();
		boolean end=(s1.endsWith(s2));
		System.out.println("Does the main string end with the ending string? "+end);								
	}
}




