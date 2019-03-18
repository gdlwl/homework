package com.lwl.proxy.dynamicproxy.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class AgentInterceptor implements MethodInterceptor {
    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    private void preIntercept(String methodName){
        System.out.println("doSomething before invoke superMethod:"+methodName);
    }
    private void postIntercept(String methodName){
        System.out.println("doSomething after invoke superMethod:"+methodName);
    }
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        preIntercept(method.getName());
        Object obj = methodProxy.invokeSuper(o,objects);
        postIntercept(method.getName());
        return obj;
    }
}
