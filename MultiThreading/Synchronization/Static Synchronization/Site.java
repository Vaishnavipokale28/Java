class Site
{
	private static int booked = 0;
	synchronized static public void doReservation()
	{ 
			Thread t = Thread.currentThread();
			if(booked<2)
			{
				for(int i=1;i<=10;i++)
				{
					System.out.println(t.getName()+"\t Reservation processing");
				}
				booked++;
				System.out.println(t.getName()+"\t your ticket booked successfully");
			}
		
			else
				System.out.println(t.getName()+"\t sorry ticket unavailable");
	}
}