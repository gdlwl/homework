package com.lwl.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AgentHandler implements InvocationHandler {
    private  Object target;
    public AgentHandler(Object target) {
        this.target = target;
    }
    public Object getInstance(){
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    private void preInvoke(String methodName){
        System.out.println("doSomething before invoke method:"+methodName);
    }
    private void postInvoke(String methodName){
        System.out.println("doSomething after invoke method:"+methodName);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName =method.getName();
        preInvoke(methodName);
        Object retVal = method.invoke(target,args);
        postInvoke(methodName);
        System.out.println("==============================");
        return retVal;
    }
}
