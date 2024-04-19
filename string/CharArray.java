import java.util.Scanner;
import java.util.Arrays;
class CharArray
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String1: ");
		String s1=sc.nextLine();
		char s2[]=s1.toCharArray();
		System.out.println(Arrays.toString(s2));		
	}
}