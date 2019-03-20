package com.lwl.tempalte.interfacetemplate;

public class MakeLongjingTea implements  MakeTea {

    @Override
    public void boilWater() {
        System.out.println("煮水");
    }

    @Override
    public void putTea() {
        System.out.println("加龙井查");
    }

    @Override
    public void addHotWater() {
        System.out.println("加热水");
    }
}
