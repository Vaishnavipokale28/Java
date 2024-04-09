import java.util.Arrays;
class Program29
{
	public static void main(String args[])
	{
		int a[]={27,92,36,29,72,43,24,71,11,9,2,57};
		String b[]={"vaishnvi","atharva","sanvi","om","priya","tanvi","disha","kiran"};
		System.out.println("Original numeric Array:"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Sorted numeric Array:"+Arrays.toString(a));
		System.out.println("Original string Array:"+Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("Sorted string Array:"+Arrays.toString(b));
	}
}