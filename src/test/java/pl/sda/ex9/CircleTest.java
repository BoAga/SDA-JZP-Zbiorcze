package pl.sda.ex9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    public void testRightCharacteristic(){
        Point2D centre = new Point2D(0, 0);
        Point2D point = new Point2D(1, 0);

        Circle circle = new Circle(centre, point);
        double r = circle.getRadius();

        assertEquals(1.0d, circle.getRadius());
        assertEquals(2 * Math.PI * r, circle.getParameter());
        assertEquals(Math.PI * r * r, circle.getArea());

    }
}
