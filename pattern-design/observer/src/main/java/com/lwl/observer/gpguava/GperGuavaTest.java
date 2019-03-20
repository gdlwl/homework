package com.lwl.observer.gpguava;

import com.google.common.eventbus.EventBus;

public class GperGuavaTest {
    public static void main(String[] args) {
        Question question = new Question() ;
        question.setUsername("小明");
        question.setContent("GUAVA如何实现观察者模式?");
        GperGuava gperGuava = GperGuava.getInstance();
        gperGuava.setQuestion(question);
        TeacherListener tomListener = new TeacherListener("Tom");
        TeacherListener micListener = new TeacherListener("Mic");

        EventBus eventBus = new EventBus();
        //注册监听者
        eventBus.register(tomListener);
        eventBus.register(micListener);
        //发布主题事件
        eventBus.post(gperGuava);
    }
}
