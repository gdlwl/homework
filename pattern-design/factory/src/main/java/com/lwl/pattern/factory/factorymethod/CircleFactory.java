package com.lwl.pattern.factory.factorymethod;

import com.lwl.pattern.factory.Circle;
import com.lwl.pattern.factory.IShape;

public class CircleFactory implements IShapeFactory {
    public CircleFactory() {
    }

    @Override
    public IShape createShape() {
        return new Circle();
    }
}
