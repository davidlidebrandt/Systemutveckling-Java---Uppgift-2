package com.labb2;

import java.lang.reflect.InvocationTargetException;

import com.shapes.Circle;
import com.shapes.Rectangle;
import com.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        try {
            Shape newCircle = Shape.createShape(Circle.class);
            Shape newRectangle = Shape.createShape(Rectangle.class);
            System.out.println(newCircle);
            System.out.println(newRectangle);
        } catch (Exception e) {
            System.out.println("An error occurred when trying to create the object");
        } 
    }
}