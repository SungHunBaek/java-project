package day59_polymorphism;

public class ShapeTests {
	public static void main(String[] args) {
		Shape shape1 = new Shape();
		shape1.draw();
		Shape shape2 = new Circle();
		shape2.draw();
		Shape shape3 = new Triangle();
		shape3.draw();
		Shape shape4 = new Square();
		shape4.draw();
	}
}
