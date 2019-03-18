package com.lwl.proxy.dynamicproxy.selfproxy;

import java.lang.reflect.Method;

public class AgentInvocationHandler implements  SelfInvocationHandler {
    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return SelfProxyGenerator.newProxyInstance(new SelfClassLoader(),clazz.getInterfaces(),this);
    }
    private void preInvoke(){
        System.out.println("调用前处理=======");
    }
    private void postInvoke(){
        System.out.println("调用后处理=======");
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preInvoke();
        Object retVal = method.invoke(target,args);
        postInvoke();
        return retVal;
    }
}
