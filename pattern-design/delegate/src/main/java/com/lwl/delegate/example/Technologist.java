package com.lwl.delegate.example;

public class Technologist implements IEmployee {
    @Override
    public void work(String workName) {
        System.out.println("产品开发中");
    }
}
