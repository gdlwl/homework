package com.lwl.adapter.loginadapter.v2;

public class PassportForThirdTest {
    public static void main(String[] args) {
        IPassportForThird passportForThird = new PassportForThirdAdapter();
        System.out.println(passportForThird.loginForQQ("AASDF"));
    }
}
