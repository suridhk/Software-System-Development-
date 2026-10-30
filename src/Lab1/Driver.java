package Lab1;

/**
 * Tests the different shapes.
 */
public class Driver {

    public static void main(String[] args) {

        // Create rectangles.
        Rectangle rect1 = new Rectangle(5, 4);
        Rectangle rect2 = new Rectangle(10, 2);

        // Create circles.
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(3);

        // Create ellipses.
        Ellipse ellipse1 = new Ellipse(8, 4);
        Ellipse ellipse2 = new Ellipse(10, 6);

        // Display rectangle details.
        System.out.println(rect1);
        System.out.println(rect2);

        // Display circle details.
        System.out.println(circle1);
        System.out.println(circle2);

        // Display ellipse details.
        System.out.println(ellipse1);
        System.out.println(ellipse2);
    }
}