package com.lwl.delegate.example;

public class Salesperson implements IEmployee {
    @Override
    public void work(String workName) {
        System.out.println("产品销售中");
    }
}
