class Circle
{
	private double radius;
		

	public void setRadius(double radius){this.radius=radius;}


	double getRadius(){return radius;}

	public double calculateArea()
	{
		return Math.PI*radius*radius;
	}
	public double calculatePerimeter()
	{
		return 2*Math.PI*radius;
	}

	
}

