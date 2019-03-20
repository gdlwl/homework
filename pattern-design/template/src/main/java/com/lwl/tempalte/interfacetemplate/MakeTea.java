package com.lwl.tempalte.interfacetemplate;

public interface MakeTea {
     default void execute(){
        boilWater();
        putTea();
        addHotWater();
    }
    //煮水
    void boilWater();
    /**
     * 放茶叶
     */
    void putTea();
    //加水
    void addHotWater();
}
