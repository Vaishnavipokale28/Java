import java.util.Arrays;
import java.util.Scanner;
import java.util.Calendar;
class HashCode
{
	public static void main(String args[])
	{	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String: ");
		String s1=sc.nextLine();
		int hashCode=s1.hashCode();
		System.out.println("Hashcode for "+s1+" is "+hashCode);
	}
}




