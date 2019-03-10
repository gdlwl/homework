package com.lwl.pattern.factory.abstractfactory;

public class WinFactory implements AbstractFactory {
    public WinFactory() {
    }

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Text createText() {
        return new WinText();
    }
}
