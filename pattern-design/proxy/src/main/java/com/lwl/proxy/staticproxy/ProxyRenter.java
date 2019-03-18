package com.lwl.proxy.staticproxy;

import com.lwl.proxy.Person;

public class ProxyRenter implements Person {
    private  Person person;

    public ProxyRenter(Person person) {
        this.person = person;
    }

    private void preRentHouse(){
        System.out.println("前置条件:交通便利，价格便宜");
    }
    public void rentHouse() {
        preRentHouse();
        person.rentHouse();
        postRentHouse();
    }
    private void postRentHouse(){
        System.out.println("后置条件:房租不随意增涨");
    }
}
