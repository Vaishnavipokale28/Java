class Reading implements Runnable
{
	public void bookReading()
	{
		for(int i=1;i<=10;i++)
			System.out.println("book reading processing");
	}
	public void run()
	{
		bookReading();
	}
}