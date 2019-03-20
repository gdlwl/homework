package com.lwl.adapter.loginadapter.v1.service;

import com.lwl.adapter.loginadapter.Member;
import com.lwl.adapter.loginadapter.ResultMsg;

public class SignInForThridService extends SignInService{
    public ResultMsg loginForQQ(String openId){
        return new ResultMsg(1,"QQ方式登录成功",new Member());
    }
    public ResultMsg loginForWechat(String openId){
        return new ResultMsg(1,"微信方式登录成功",new Member());
    }
    public ResultMsg loginForTelphone(String telphone, String code){
        return new ResultMsg(1,"手机方式登录成功",new Member());
    }
    public ResultMsg loginForToken(String token){
        return new ResultMsg(1,"令牌方式登录成功",new Member());
    }
}
