package com.lwl.adapter.loginadapter.v1;

import com.lwl.adapter.loginadapter.v1.service.SignInForThridService;

public class SignInForThridTest {
    public static void main(String[] args) {

        SignInForThridService signInService = new SignInForThridService();
        System.out.println(signInService.loginForQQ("asdfsd"));
    }
}
