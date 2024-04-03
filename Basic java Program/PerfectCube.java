
import java.util.Arrays;
class PerfectCube
{
	public static void main(String arg[])
	{
		int n=27;
		if(Math.cbrt(n)%1==0)
			System.out.println(n+" is the perfect cube");
		else
			System.out.println(n+" is the note perfect cube");
	}
}