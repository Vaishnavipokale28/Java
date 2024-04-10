class StringisEmpty
{
	public static void main(String args[])
	{
		String s1="Vaishnavi";
		String s2=" ";
		String s3= "";
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());
		if(s1.length()==0||s1.isEmpty())
			System.out.println("String is empty");
		else
			System.out.println(s1);
		if(s2.length()==0||s2.isEmpty())
				System.out.println("String is empty");
		else
			System.out.println(s2);
		if(s3.length()==0||s3.isEmpty())					
			System.out.println("String is empty");
		else
			System.out.println(s3);
	}
}