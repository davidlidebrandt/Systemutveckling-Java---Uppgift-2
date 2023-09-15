package com.labb2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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

        List<Shape> l = new ArrayList<>();
        l.add(new Circle(1.0));
        l.add(new Circle(2000.0));
        l.add(new Rectangle(100.1, 100.1));
        l.add(new Rectangle(1.3, 1.3));
        l.sort(null);
        
        System.out.println(l);

        HashSet<Shape> hs = new HashSet<>();
        hs.add(new Circle(1.1));
        hs.add(new Circle(1.1));
        hs.add(new Circle(1.1));
        hs.add(new Circle(1.3));

        System.out.println(hs);
    }
}