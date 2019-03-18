package com.lwl.proxy.dynamicproxy.selfproxy;

public class SelfProxyTest {
    public static void main(String[] args) {
        ICarRent carRent = (ICarRent)new AgentInvocationHandler().getInstance(new CarRenter());
        carRent.rentCar();
    }
}
