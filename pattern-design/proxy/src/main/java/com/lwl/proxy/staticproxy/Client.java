package com.lwl.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        ProxyRenter proxyRenter = new ProxyRenter(new Renter());
        proxyRenter.rentHouse();
    }
}
