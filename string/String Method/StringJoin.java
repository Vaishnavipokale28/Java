class StringJoin
{
	public static void main(String args[])
	{
		String s1=String.join("-","Vaishnavi","Nitin","Pokale");
		System.out.println(s1);	
		String date=String.join("/","28","12","2002");
		System.out.println("Date: "+date);
		String time=String.join(":","12","10","08");
		System.out.println("Time: "+time);		
	}
}