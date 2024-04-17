import java.util.Arrays;
import java.util.Scanner;
class Concat
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String1: ");
		String s1=sc.nextLine();
		System.out.print("Enter String2: ");
		String s2=sc.nextLine();
		String s3=s1.concat(s2);
		System.out.println(s3);								
	}
}




