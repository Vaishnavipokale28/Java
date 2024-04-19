import java.util.Scanner;
class StartsWith
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String1: ");
		String s1=sc.nextLine();
		System.out.print("Enter String2: ");
		String s2=sc.nextLine();
		boolean a=s1.startsWith(s2);
		System.out.println(s1 + " starts with " +
             s2 + "? "+a);
		
	}
}