package com.shapes;

public class Circle extends Shape {

    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    double getPerimeter() {
        return Math.pow(Math.PI*this.radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // @Override
    // public int compareTo(Shape c) {
    //     Double v = this.getArea() - c.getArea();
    //     return v.intValue();
    // }
    
}
