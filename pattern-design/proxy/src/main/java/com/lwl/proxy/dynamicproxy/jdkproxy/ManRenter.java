package com.lwl.proxy.dynamicproxy.jdkproxy;

import com.lwl.proxy.Person;

public class ManRenter implements Person,ISportRent{
    public void rentHouse() {
        System.out.println("附件有运动场所");
        System.out.println("附件吃饭方便");
        System.out.println("男生租房子");
    }
    public  void rentBadmintonCourt(){
        System.out.println("租羽毛球场");
    }
}
