package com.lwl.prototype.simple;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        //new新的原型对象
        SimplePrototype simplePrototype = new SimplePrototype();
        simplePrototype.setAge(10);
        simplePrototype.setName("tom");
        simplePrototype.setBirthDate(new Date());
        //通过clone方法创建新对象
        SimplePrototype copySimplePrototype = (SimplePrototype)simplePrototype.clone();
        System.out.println(simplePrototype==copySimplePrototype);
        System.out.println(simplePrototype.getAge()==copySimplePrototype.getAge());
        System.out.println(simplePrototype.getBirthDate()==copySimplePrototype.getBirthDate());

    }
}
