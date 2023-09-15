package com.shapes;

public class Rectangle extends Shape {
    
    private double height;
    private double width;

    @Override
    double getArea() {
        return height * width;
    }

    @Override
    double getPerimeter() {
        return height * 2 + width * 2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
}
