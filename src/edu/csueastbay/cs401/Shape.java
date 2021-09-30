package edu.csueastbay.cs401;

import java.awt.*;

public abstract class Shape implements Comparable<Shape>, Hideable {
    private String color;
    private Point point = new Point(0,0);
    private boolean hidden = false;

    public Shape(String color) {

        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPoint(int x, int y) {
        point.setX(x);
        point.setY(y);
    }

    public int getX() {
        return point.getX();
    }

    public int getY() {
        return point.getY();
    }

    public Point getPoint() {
        Point new_point = new Point(point.getX(), point.getY());
        return new_point;
    }

    public abstract double area();

    @Override
    public int compareTo(Shape rhs) {
        return Double.compare(this.area(), rhs.area());
    }
    @Override
    public void hide() {
        hidden = true;
    }

    @Override
    public void show() {
        hidden = false;
    }

    @Override
    public boolean isHidden() {
        return hidden;
    }

}
