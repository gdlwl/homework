package com.lwl.adapter.loginadapter.v2;

import com.lwl.adapter.loginadapter.ResultMsg;
import com.lwl.adapter.loginadapter.v1.service.SignInService;
import com.lwl.adapter.loginadapter.v2.adapters.LoginAdapter;
import com.lwl.adapter.loginadapter.v2.adapters.LoginForQQAdapter;
import com.lwl.adapter.loginadapter.v2.adapters.LoginForTokenAdapter;
import com.lwl.adapter.loginadapter.v2.adapters.LoginForWechatAdapter;

public class PassportForThirdAdapter extends SignInService implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String id) {
        return processLogin(id, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return processLogin(id, LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token, LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return processLogin(telphone, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForRegist(String username, String password) {
        super.registry(username,password);
        return super.login(username,password);
    }

    public ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz){
        ResultMsg resultMsg = null;
        try {
            LoginAdapter loginAdapter = clazz.newInstance();
            if(loginAdapter.support(loginAdapter)){
                resultMsg = loginAdapter.login(key,loginAdapter);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return resultMsg;
    }
}
