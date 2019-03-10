package com.lwl.pattern.factory.abstractfactory;

public class UnixFactory implements AbstractFactory {
    public UnixFactory() {
    }

    @Override
    public Button createButton() {
        return new UnixButton();
    }

    @Override
    public Text createText() {
        return new UnixText();
    }
}
