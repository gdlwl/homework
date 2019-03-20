package com.lwl.decorator.battercake;

public class SausageDecorator implements IBattercake {
    private  IBattercake battercake;

    public SausageDecorator(IBattercake battercake) {
        this.battercake = battercake;
    }

    @Override
    public String getMsg() {
        return battercake.getMsg()+"+1条香肠";
    }

    @Override
    public int getPrice() {
        return battercake.getPrice()+2;
    }
}
