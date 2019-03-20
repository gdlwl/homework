package com.lwl.observer.example;

public class HexObserver implements Observer{
    @Override
    public void update(Subject subject) {
        System.out.println("当前状态16进制字符为:"+Integer.toHexString(subject.getState()));
    }
}
