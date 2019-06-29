package day55_abstraction;

public class Circle extends Shape{
	double radius;
	public Circle() {
		super("Circle");
	}
	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius,2);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("  ***  \n" + 
				" *   * \n" + 
				"*     *\n" + 
				"*     *\n" + 
				"*     *\n" + 
				" *   * \n" + 
				"  ***");
	}
	
}
