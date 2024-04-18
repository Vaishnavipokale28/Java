import java.util.Arrays;
import java.util.Scanner;
import java.util.Calendar;
class Calendar
{
	public static void main(String args[])
	{	
		Calendar c= Calendar.getInstance();
		System.out.println("current Date and Time: ");
		System.out.format("%tB %te,%tY%n",c,c,c);						System.out.format("%tl:%tM %tp%n", c, c, c);		
	}
}




