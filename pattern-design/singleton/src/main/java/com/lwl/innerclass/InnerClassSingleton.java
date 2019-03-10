package com.lwl.innerclass;

public class InnerClassSingleton {
    static{
        System. out.println("InnerClassSingleton静态代码块初始化" );
    }
    private InnerClassSingleton() {
        System. out.println("InnerClassSingleton构造器初始化" );
        //防止反射破坏单例
        if(SingletonHolder.instance!=null){
            throw new RuntimeException("无法重建InnerClassSingleton!");
        }
    }
    public static InnerClassSingleton getInstance(){
        return SingletonHolder.instance;
    }
    private static class SingletonHolder{
        static{
            System. out.println("SingletonHolder静态代码块初始化" );
        }
        private static final InnerClassSingleton instance = new InnerClassSingleton();
    }
}
