package com.lwl.observer.gpguava;

public class GperGuava {
    private String name="Gper 生态圈";
    private static GperGuava gperGuava = new GperGuava();
    private Question question;
    private GperGuava(){

    };
    public static GperGuava getInstance(){
        return  gperGuava;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

}
