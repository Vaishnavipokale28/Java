import java.util.Arrays;
import java.util.Scanner;
class IgnoreCase
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String1: ");
		String s1=sc.nextLine();
		System.out.print("Enter String2: ");
		String s2=sc.nextLine();
		System.out.print("Enter String3: ");
		String s3=sc.nextLine();
		boolean string1=s1.equalsIgnoreCase(s2);
		System.out.println(s1+" and "+s2+" are equals: "+string1);
		boolean string2=s1.equalsIgnoreCase(s3);
		System.out.println(s1+" and "+s3+" are equals: "+string2);
		boolean string3=s2.equalsIgnoreCase(s3);
		System.out.println(s2+" and "+s3+" are equals: "+string3);
										
	}
}




