class MainClass7
{
	public static void main(String args[])
	{
		Circle circle=new Circle();
		circle.setRadius(7.0);

		double radius=circle.getRadius();
			
		double area =circle.calculateArea();
		double perimeter=circle.calculatePerimeter();

		System.out.println("Radius of Circle: "+radius);
		System.out.println("Area of Circle: "+area);
		System.out.println("Perimeter of circle: "+perimeter);
		
	}
}