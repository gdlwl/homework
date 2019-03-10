package com.lwl.lazy;

public class LazySimpleSingleton {
    private static LazySimpleSingleton instance = null;

    private LazySimpleSingleton() {
    }
    //方法锁
    public synchronized  static LazySimpleSingleton getInstance(){
        if(instance==null){
            instance = new LazySimpleSingleton();
        }
        return instance;
    }
}
