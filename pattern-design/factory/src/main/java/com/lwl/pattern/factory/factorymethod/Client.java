package com.lwl.pattern.factory.factorymethod;

import com.lwl.pattern.factory.IShape;

public class Client {
    public static void main(String[] args) {
        IShapeFactory squareFactory = new SquareFactory();
        IShape square = squareFactory.createShape();
        square.draw();
        IShapeFactory circleFactory = new CircleFactory();
        IShape circle = circleFactory.createShape();
        circle.draw();
    }
}
