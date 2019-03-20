package com.lwl.observer.gpguava;

import com.google.common.eventbus.Subscribe;

public class TeacherListener {
    private String name;

    public TeacherListener(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Subscribe
    public void listenerGperGuava(GperGuava gperGuava){
        System.out.println(this.getName()+"老师，你收到一个来自"+gperGuava.getName()+"的提问。\r\n 提问人:"
                +gperGuava.getQuestion().getUsername() +"\r\n 提问内容:"+gperGuava.getQuestion().getContent());
    }

}
