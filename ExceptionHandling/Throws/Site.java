class Site
{
	private void home()
	{
		System.out.println("welcome to your second home");
	}
	public void login(int age)throws ClassNotFoundException,InstantiationException,IllegalAccessException
	{
		System.out.println("Welcome to this site ");
		if(age>=70)
			home();
		else
			throw new NullPointerException();

		System.out.println("Thank you for visit");
	}

}