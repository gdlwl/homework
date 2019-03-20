package com.lwl.adapter.poweradapter;

public class PowerAdapter implements DC5 {
    private  AC200 ac200;

    public PowerAdapter(AC200 ac200) {
        this.ac200 = ac200;
    }

    @Override
    public void outputDC5() {
        int input = ac200.outputAC200();
        int output = input/44;
        System.out.println("输出电流DC"+output+"V");
    }
}
