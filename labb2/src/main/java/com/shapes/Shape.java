package com.shapes;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public abstract class Shape {

    abstract double getArea();

    abstract double getPerimeter();

    public static <T extends Shape> Shape createShape(Class<T> shape ) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Constructor<T> shapeConstructor = shape.getConstructor();
        Shape newShape = shapeConstructor.newInstance();
        return newShape; 
    }
    
}
