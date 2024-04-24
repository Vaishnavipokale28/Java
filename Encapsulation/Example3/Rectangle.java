class Rectangle
{
	private double length;
	private double width;

	public void setLength(double length){this.length=length;}
	public void setWidth(double width){this.width=width;}

	
	double getLength(){return length;}
	double getWidth(){return width;}

	Rectangle(double length, double width)
	{
		this.length=length;
		this.width=width;
	}
	
	Rectangle()
	{

	}

	public String toString(){
		return "[Length "+length+" Width "+width+"]" ;
	}

}

