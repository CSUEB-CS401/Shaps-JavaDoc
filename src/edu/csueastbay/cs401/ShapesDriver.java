package edu.csueastbay.cs401;

import java.util.ArrayList;


public class ShapesDriver {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(27, "red"));
        shapes.add(new Rectangle(89, 675, "Yellow"));
        shapes.add(new Circle(100, "Blue"));
        shapes.add(new Rectangle(45, 38, "Green"));

        for(Shape shape: shapes) {
            System.out.println("Shape area: " + shape.area() + " color: " + shape.getColor());
            shape.setPoint(6 ,70);
            Point p = shape.getPoint();
            p.setX(89);
            System.out.println("point: " + shape.getX() + "," + shape.getY());
        }

        System.out.println("_________________________________");





	    Circle circle = new Circle(34, "red");
        System.out.println("Circle: " + circle.area() + " " + circle.getColor());

        Rectangle rectangle = new Rectangle(10, 90, "blue");
        System.out.println("Rectangle: " + rectangle.area() + " " + rectangle.getColor());
    }



}
