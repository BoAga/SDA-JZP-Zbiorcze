package pl.sda.ex9;

import org.junit.jupiter.api.Test;
import pl.sda.ex10.MoveDirection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    public void testRightCharacteristicAfterMove(){
        Point2D centre = new Point2D(0, 0);
        Point2D point = new Point2D(0, 1);

        Circle circle = new Circle(centre, point);
        double r = circle.getRadius();

        assertEquals(1.0d, circle.getRadius());
        assertEquals(2 * Math.PI * r, circle.getParameter());
        assertEquals(Math.PI * r * r, circle.getArea());

        MoveDirection md = new MoveDirection(2.5d, -3.0);
        circle.move(md);
        assertEquals(2.5 , circle.getCentre().getX());
        assertEquals(-2 , circle.getPoint().getY());

    }


}
