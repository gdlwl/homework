package com.lwl.pattern.factory.simplefactory;

import com.lwl.pattern.factory.IShape;
import com.lwl.pattern.factory.Square;

public class Client {
    public static void main(String[] args) {
        IShape square = ShapeFactory.createShape("square");
        square.draw();
        IShape square1 = ShapeFactory.createShape(Square.class);
        square1.draw();
    }
}
