class User implements Runnable
{
	private Site s = null;
	User(){}
	User(Site s){this.s=s;}
	public void run()
	{
		try{
		Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
		s.doReservation();
	}
}