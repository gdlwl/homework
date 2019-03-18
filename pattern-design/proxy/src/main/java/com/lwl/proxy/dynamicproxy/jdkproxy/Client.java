package com.lwl.proxy.dynamicproxy.jdkproxy;

import com.lwl.proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

public class Client {
    public static void main(String[] args) {
        Object obj = new AgentHandler(new ManRenter()).getInstance();

        try {
            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class,ISportRent.class});
            FileOutputStream fos = new FileOutputStream("D://Proxy0.class");
            fos.write(bytes);
            fos.close();
            Method methodRentHosue = obj.getClass().getMethod("rentHouse",null);
            methodRentHosue.invoke(obj);
            Method method = obj.getClass().getMethod("rentBadmintonCourt",null);
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
