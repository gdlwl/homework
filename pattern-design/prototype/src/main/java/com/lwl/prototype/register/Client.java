package com.lwl.prototype.register;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        //初始化注册原型
        PrototypeManager.initPrototype();
        //创建注册原型
        RegisterPrototype registerPrototype = new RegisterPrototype();
        registerPrototype.setName("Lucy");
        registerPrototype.setBirthDate(new Date());
        //放入原型管理器
        PrototypeManager.addPrototype("teacher",registerPrototype);
        //原型管理器获取新增的teacher 原型
        Prototype  teacher =PrototypeManager.getPrototype("teacher");
        teacher.setName("Lily");
        teacher.setBirthDate(new Date());

        Prototype student = PrototypeManager.getPrototype("student");

        System.out.println(teacher);
        System.out.println(student);
    }
}
