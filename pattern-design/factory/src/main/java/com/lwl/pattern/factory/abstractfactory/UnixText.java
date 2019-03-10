package com.lwl.pattern.factory.abstractfactory;

public class UnixText implements Text{
    public UnixText() {
    }

    @Override
    public void edit() {
        System.out.println("unixText eidt");
    }
}
