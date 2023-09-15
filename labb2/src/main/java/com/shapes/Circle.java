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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Circle other = (Circle) obj;
        if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    // @Override
    // public int compareTo(Shape c) {
    //     Double v = this.getArea() - c.getArea();
    //     return v.intValue();
    // }
    
}
