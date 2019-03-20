package com.lwl.observer.example;

public class OctalObserver implements Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("当前状态8进制字符串为:"+Integer.toOctalString(subject.getState()));
    }
}
