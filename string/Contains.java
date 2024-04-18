import java.util.Arrays;
import java.util.Scanner;
class Contains
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s1=sc.nextLine();
		System.out.print("Enter Specified sequence of char: ");
		String s2=sc.nextLine();
		System.out.println(s1.contains(s2));								
	}
}




