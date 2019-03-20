package com.lwl.adapter.objectadapter;

public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void opt1() {
        adaptee.opt1();
    }

    @Override
    public void opt2() {

    }
}
