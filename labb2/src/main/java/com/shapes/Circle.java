package com.shapes;

public class Circle extends Shape {

    private double radius;

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
    
}
