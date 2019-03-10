package com.lwl.pattern.factory.factorymethod;

import com.lwl.pattern.factory.IShape;
import com.lwl.pattern.factory.Rectangle;

public class RectangleFactory implements IShapeFactory {
    public RectangleFactory() {
    }
    @Override
    public IShape createShape() {
        return new Rectangle();
    }
}
