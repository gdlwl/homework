package com.lwl.pattern.factory.abstractfactory;

public class WinText implements Text{
    public WinText() {
    }

    @Override
    public void edit() {
        System.out.println("winText eidt");
    }
}
