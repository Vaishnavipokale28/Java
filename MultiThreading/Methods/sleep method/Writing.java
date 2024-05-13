class Writing implements Runnable
{
	public void bookWriting()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("book writing processing");
			try{
			Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
		
	}
	public void run()
	{
		bookWriting();
	}
}