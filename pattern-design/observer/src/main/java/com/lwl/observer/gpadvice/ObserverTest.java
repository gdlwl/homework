package com.lwl.observer.gpadvice;

public class ObserverTest {
    public static void main(String[] args) {
        Gper gper = Gper.getInstance();
        Question question = new Question();
        question.setUsername("小明");
        question.setContent("观察者模式的应用场景是什么?");
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");
        gper.addObserver(tom);
        gper.addObserver(mic);
        gper.publishQuestion(question);
    }
}
