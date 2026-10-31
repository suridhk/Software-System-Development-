package Lab1;

/**
 * Represents a circle.
 */
public class Circle extends Shape {

	private double radius;

	/**
	 * Creates a circle.
	 */
	public Circle(double radius) {
		super(0);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	/**
	 * Displays the circle's details.
	 */
	@Override
	public String toString() {
		return "Circle: Radius = " + radius + ", Area = " + getArea() + ", Sides = " + getSides();
	}
}