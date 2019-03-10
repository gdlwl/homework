package com.lwl.pattern.factory.abstractfactory;

public class WinButton implements Button {
    public WinButton() {
    }

    @Override
    public void click() {
        System.out.println("winButton click");
    }
}
