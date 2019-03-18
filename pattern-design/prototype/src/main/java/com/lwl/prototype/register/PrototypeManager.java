package com.lwl.prototype.register;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
    private static Map<String,Prototype> prototypeMap = new HashMap<String,Prototype>();

    public static void addPrototype(String key, Prototype prototype){
        prototypeMap.put(key, prototype);
    }
    public static  void removeProtype(String key){
        prototypeMap.remove(key);
    }

    public static Prototype getPrototype(String key){
        return (Prototype)prototypeMap.get(key).clone();
    }

    public static void initPrototype(){
        RegisterPrototype student = new RegisterPrototype();
        student.setName("tom");
        student.setBirthDate(new Date());
        //初始化一个学生原型
        prototypeMap.put("student",student);
    }
}
