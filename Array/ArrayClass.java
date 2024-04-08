class ArrayClass
{
	public static void main(String args[])
	{
		ArrayMethod am = new ArrayMethod();
		int a[]={23,10,37,20,15,30,40,50,27,12,42,84,29};
		System.out.println(am.sumOfArray(a));
		System.out.println(am.avgOfArray(a));
		int b[]= am.findOddFromArray(a);
		am.displayArray(b);
		System.out.println(am.findAvgOfOddFromArray(a));
		int c[]=am.findEvenFromArray(a);
		am.displayArray(c);
		System.out.println(am.findAvgOfEvenFromArray(a));	
	}	
	
}