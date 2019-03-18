package com.lwl.proxy.dynamicproxy.selfproxy;

public class CarRenter implements ICarRent {
    @Override
    public void rentCar() {
        System.out.println("品牌是法拉利");
        System.out.println("售价100万以上");
        System.out.println("租赁汽车");
    }
}
