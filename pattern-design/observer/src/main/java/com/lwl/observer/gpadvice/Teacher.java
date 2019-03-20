package com.lwl.observer.gpadvice;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Gper gper= (Gper)o;
        gper.getName();
        Question q =(Question)arg;
        System.out.println(this.getName()+"老师，你收到一个来自"+gper.getName()+"的提问。\r\n 提问人:"+q.getUsername()
                +"\r\n 提问内容:"+q.getContent());
    }
}
