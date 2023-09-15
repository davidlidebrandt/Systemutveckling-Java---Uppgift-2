package com.shapes;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public abstract class Shape implements Comparable<Shape> {

    abstract double getArea();

    abstract double getPerimeter();

    public static <T extends Shape> Shape createShape(Class<T> shapeClass ) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Constructor<T> shapeConstructor = shapeClass.getConstructor();
        Shape newShape = shapeConstructor.newInstance();
        return newShape; 
    }

    
    @Override
    public int compareTo(Shape r) {
        Double v = this.getArea() - r.getArea();
        return v.intValue();
    }
    
}
