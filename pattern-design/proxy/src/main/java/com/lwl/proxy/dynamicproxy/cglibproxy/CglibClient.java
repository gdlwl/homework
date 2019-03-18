package com.lwl.proxy.dynamicproxy.cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;

public class CglibClient {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"D://cglib_proxy_classes");
        WomanRenter obj = (WomanRenter)new AgentInterceptor().getInstance(WomanRenter.class);
        obj.rentHouse();
    }
}
