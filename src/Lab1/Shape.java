package Lab1;

/**
 * Abstract parent class for all shapes.
 */
public abstract class Shape {

    // Stores the number of sides.
    private int sides;

    /**
     * Creates a shape with a given number of sides.
     */
    public Shape(int sides) {
        this.sides = sides;
    }

    /**
     * Returns the number of sides.
     */
    public int getSides() {
        return sides;
    }

    /**
     * Calculates the area of the shape.
     */
    public abstract double getArea();
}