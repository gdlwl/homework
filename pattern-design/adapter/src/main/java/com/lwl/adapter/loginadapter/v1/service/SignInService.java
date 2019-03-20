package com.lwl.adapter.loginadapter.v1.service;

import com.lwl.adapter.loginadapter.Member;
import com.lwl.adapter.loginadapter.ResultMsg;

public class SignInService {
    public ResultMsg registry(String usernaem, String password){
        return new ResultMsg(1,"注册成功",new Member());
    }
    public ResultMsg login(String usernaem, String password){
        return new ResultMsg(1,"登录成功",new Member());
    }
}
