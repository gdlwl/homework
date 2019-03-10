package com.lwl.pattern.factory.abstractfactory;

public class UnixButton implements Button {
    public UnixButton() {
    }

    @Override
    public void click() {
        System.out.println("unixButton click");
    }
}
