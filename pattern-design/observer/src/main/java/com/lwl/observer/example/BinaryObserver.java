package com.lwl.observer.example;

public class BinaryObserver implements Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("当前状态二进制字符串为:"+Integer.toBinaryString(subject.getState()));
    }
}
