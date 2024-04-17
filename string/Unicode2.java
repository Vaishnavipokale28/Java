import java.util.Arrays;
import java.util.Scanner;
class Unicode2
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s1=sc.nextLine();
		System.out.print("Enter Starting Index: ");
		int start=sc.nextInt();
		System.out.print("Enter End Index: ");
		int end=sc.nextInt();
		if(start>0 && start<s1.length()&& start<=end)
		{
			int unicode=s1.codePointCount(start,end);
			System.out.println("Number of Unicode code points from index " + start + " to " + end + " is: " + unicode);
		}
		else
			System.out.println("Invalid Index!!");
		
						
	}
}




