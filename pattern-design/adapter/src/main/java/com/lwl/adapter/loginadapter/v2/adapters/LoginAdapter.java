package com.lwl.adapter.loginadapter.v2.adapters;

import com.lwl.adapter.loginadapter.ResultMsg;

public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String key,Object adapter);
}
