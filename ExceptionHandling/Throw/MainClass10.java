class MainClass10
{
	public static void main(String args[])
	{
		System.out.println("Program Started");
		Site s= new Site();
		try{
		s.login(31);
		}catch(NullPointerException e)
		{
			System.out.println(e);
		}
		System.out.println("Program Ended");
	}
}