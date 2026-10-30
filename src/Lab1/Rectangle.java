package Lab1;

/**
 * Represents a rectangle.
 */
public class Rectangle extends Shape {

    private double width;
    private double height;

    /**
     * Creates a rectangle.
     */
    public Rectangle(double width, double height) {
        this(width, height, 4);
    }

    /**
     * Allows a subclass to specify its number of sides.
     */
    protected Rectangle(double width, double height, int sides) {
        super(sides);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    /**
     * Displays the rectangle's details.
     */
    @Override
    public String toString() {
        return "Rectangle: Width = " + width
                + ", Height = " + height
                + ", Area = " + getArea()
                + ", Sides = " + getSides();
    }
}