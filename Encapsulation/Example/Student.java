class Student
{
	private int sid;
	private String sname;
	private String scity;
	private double spercentage;


	public void setSid(int sid){this.sid=sid;}
	public void setSname(String sname){this.sname=sname;}
	public void setScity(String scity){this.scity=scity;}
	public void setSpercentage(double spercentage){this.spercentage=spercentage;}


	int getSid(){return sid;}
	String getSname(){return sname;}
	String getScity(){return scity;}
	double getSpercentage(){return spercentage;}


	Student(){}
	Student(int sid,String sname,String scity,double spercentage)
	{
		this.sid=sid;
		this.sname=sname;
		this.spercentage=spercentage;
		this.scity=scity;
	}


	public String toString(){
		return"Student[sid="+sid+",sname="+sname+",scity="+scity+",spercentage="+spercentage+"]";
	}
}
