package com.lwl.hungry;

import java.io.Serializable;
//反序列化时导致单例破坏
public class SerializableSingleton implements Serializable {
    private  static final SerializableSingleton instance = new SerializableSingleton();
    private SerializableSingleton(){}
    public static SerializableSingleton getInstance(){
        return  instance;
    }
    private  Object readResolve(){
        return  instance;
    }
}
