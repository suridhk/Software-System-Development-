package Lab1;

/**
 * Represents an ellipse.
 */
public class Ellipse extends Rectangle {

    /**
     * Creates an ellipse with a width and height.
     */
    public Ellipse(double width, double height) {
        super(width, height, 0);
    }

    /**
     * Calculates the area of the ellipse.
     */
    @Override
    public double getArea() {
        return Math.PI * getWidth() / 2 * getHeight() / 2;
    }

    /**
     * Displays the ellipse's width, height, area and number of sides.
     */
    @Override
    public String toString() {
        return "Ellipse: Width = " + getWidth()
                + ", Height = " + getHeight()
                + ", Area = " + getArea()
                + ", Sides = " + getSides();
    }
}