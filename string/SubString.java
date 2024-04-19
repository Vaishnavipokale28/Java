import java.util.Scanner;
class SubString
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String1: ");
		String s1=sc.nextLine();
		System.out.print("Enter String2: ");
		String s2=sc.nextLine();
		String newStr=s1.substring(5,19);
		String newStr1=s2.substring(2,15);
		System.out.println(newStr);
		System.out.println(newStr1);
		
	}
}