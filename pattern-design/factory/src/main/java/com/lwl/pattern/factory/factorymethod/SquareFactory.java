package com.lwl.pattern.factory.factorymethod;

import com.lwl.pattern.factory.IShape;
import com.lwl.pattern.factory.Square;

public class SquareFactory implements IShapeFactory{
    public SquareFactory() {
    }
    public IShape createShape() {
        return new Square();
    }
}
