class StringEquals
{
	public static void main(String args[])
	{
		String s1="Vaishnavi";
		String s2="vaishnavi";
		String s3= new String ("Vaishnavi");
		String s4="vaishnavi";
		String s5="Vaishnavi";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1==s5);

		
	}
}