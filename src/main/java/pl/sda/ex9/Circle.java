package pl.sda.ex9;

import pl.sda.ex10.Movable;
import pl.sda.ex10.MoveDirection;
import pl.sda.ex11.Resizable;

public class Circle implements Movable, Resizable {
    private Point2D centre;
    private Point2D point;

    public Circle(Point2D centre, Point2D point) {
        this.centre = centre;
        this.point = point;
    }

    public Point2D getCentre() {
        return centre;
    }

    public void setCentre(Point2D centre) {
        this.centre = centre;
    }

    public Point2D getPoint() {
        return point;
    }

    public void setPoint(Point2D point) {
        this.point = point;
    }
    public double getRadius(){
        double diffX = centre.getX() - point.getX();
        double diffY = centre.getY() - point.getY();

        return Math.sqrt(diffX*diffX + diffY*diffY);
    }

    public double getParameter(){
        return 2*Math.PI*getRadius();
    }
    public double getArea(){
        double r = getRadius();
        return Math.PI *r * r;
    }

    @Override
    public void move(MoveDirection md) {
        centre.move(md);
        point.move(md);
    }

    @Override
    public void resize(double resizeFactor) {
        double diffX = point.getX() - centre.getX();
        double diffY = point.getY() - centre.getY();
        diffX *= resizeFactor; diffY *= resizeFactor - 1;
        MoveDirection md = new MoveDirection(diffX, diffY);
        point.move(md);
    }
}
