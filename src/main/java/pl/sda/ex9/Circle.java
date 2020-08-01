package pl.sda.ex9;

public class Circle {
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
}
