class Site
{
	private boolean booked = false;
	synchronized  public void doReservation()
	{ 
			Thread t = Thread.currentThread();
			if(!booked)
			{
				for(int i=1;i<=10;i++)
				{
					System.out.println(t.getName()+"\t Reservation processing");
				}
				booked=true;
				System.out.println(t.getName()+"\t your ticket booked successfully");
			}
		
			else
				System.out.println(t.getName()+"\t sorry ticket unavailable");
	}
}