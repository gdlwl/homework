package com.lwl.decorator.battercake;

public class BattercakeTest
{
    public static void main(String[] args) {
        IBattercake battercake = new Battercake();
        battercake= new EggDecorator(battercake);
        battercake = new SausageDecorator(battercake);
        battercake = new SausageDecorator(battercake);
        System.out.println(battercake.getMsg()+",总价:"+battercake.getPrice());
    }
}
