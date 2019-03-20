package com.lwl.decorator.battercake;

public class EggDecorator implements  IBattercake {
    private IBattercake battercake;
    public EggDecorator(IBattercake battercake) {
        this.battercake =battercake;
    }

    @Override
    public String getMsg() {
        return battercake.getMsg()+"+1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return battercake.getPrice()+1;
    }
}
