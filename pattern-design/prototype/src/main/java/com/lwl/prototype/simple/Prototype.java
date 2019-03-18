package com.lwl.prototype.simple;

import java.util.Date;

public abstract  class Prototype implements   Cloneable{
    private int age;
    private String name;
    private Date birthDate;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public Object clone() {
        Object cloneObj = null;
        try {
            //使用浅克隆，即引用对象不进行复制
            cloneObj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloneObj;
    }
}
