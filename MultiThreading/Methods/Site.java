class Site
{
	public void doReservation()
	{
		Thread t = Thread.currentThread();
		for(int i=1;i<=10;i++)
		{
			System.out.println(t.getPriority()+"\t"+t.getName() +"\t reservation processing");
		}
	}
}