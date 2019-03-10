package com.lwl.lazy;

public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {
    }
    //方法锁
/*    public synchronized  static LazySingleton getInstance(){
        if(instance==null){
            instance = new LazySingleton();
        }
        return instance;
    }*/
    //双重检查锁
    public static LazySingleton getInstance(){
        if(instance==null){
            synchronized(LazySingleton.class){
                if(instance==null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
