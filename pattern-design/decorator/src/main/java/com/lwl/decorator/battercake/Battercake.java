package com.lwl.decorator.battercake;

public class Battercake implements  IBattercake {
    @Override
    public String getMsg() {
        return "煎饼";
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
