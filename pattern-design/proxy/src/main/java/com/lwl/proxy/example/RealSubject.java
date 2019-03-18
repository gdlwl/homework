package com.lwl.proxy.example;

public class RealSubject implements  Subject{
    public void request() {
        System.out.println("From RealSubject");
    }
}
