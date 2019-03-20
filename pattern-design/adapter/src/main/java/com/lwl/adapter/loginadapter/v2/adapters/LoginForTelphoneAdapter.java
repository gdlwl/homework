package com.lwl.adapter.loginadapter.v2.adapters;

import com.lwl.adapter.loginadapter.Member;
import com.lwl.adapter.loginadapter.ResultMsg;

public class LoginForTelphoneAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof  LoginForTelphoneAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return new ResultMsg(1,"手机方式登录成功",new Member());
    }
}
