package com.lwl.observer.gpadvice;


import java.util.Observable;

public class Gper extends Observable {
    private String name="Gper 生态圈";
    private static Gper gper = null;
    private Gper() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static Gper  getInstance(){
        if(gper==null){
            gper = new Gper();
        }
        return gper;
    }
    public void publishQuestion(Question question){
        System.out.println(question.getUsername()+"提出了一个问题，问题内容为:"+question.getContent());
        setChanged();
        notifyObservers(question);
    }
}
