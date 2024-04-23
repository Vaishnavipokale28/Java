class MainClass7
{
	public static void main(String args[])
	{
		Student s1= new Student();
		s1.setSid(10);
		s1.setSname("ABC");
		s1.setScity("DEF");
		s1.setSpercentage(72.21);
		System.out.println("ID:"+s1.getSid());
		System.out.println("Name:"+s1.getSname());
		System.out.println("City:"+s1.getScity());
		System.out.println("Percentage:"+s1.getSpercentage());

		Student s2= new Student(20,"ABC","Mumbai",81.43);
		System.out.println(s2);
	}
}