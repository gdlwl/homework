package com.lwl.adapter.poweradapter;

public class PowerAdapterTest {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC200());
        dc5.outputDC5();
    }
}
