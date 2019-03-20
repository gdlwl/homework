package com.lwl.observer.example;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new BinaryObserver());
        subject.addObserver(new HexObserver());
        subject.addObserver(new OctalObserver());
        subject.setState(15);
        subject.setState(15);
    }
}
