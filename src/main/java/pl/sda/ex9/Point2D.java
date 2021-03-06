package pl.sda.ex9;

import pl.sda.ex10.Movable;
import pl.sda.ex10.MoveDirection;

public class Point2D implements Movable {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    @Override
    public void move(MoveDirection md) {
        x = x + md.getX();
        y = y + md.getY();
    }
}
