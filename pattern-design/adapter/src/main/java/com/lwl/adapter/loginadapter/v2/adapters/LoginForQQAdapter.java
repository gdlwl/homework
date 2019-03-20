package com.lwl.adapter.loginadapter.v2.adapters;

import com.lwl.adapter.loginadapter.Member;
import com.lwl.adapter.loginadapter.ResultMsg;

public class LoginForQQAdapter implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return new ResultMsg(1,"QQ方式登录成功",new Member());
    }
}
