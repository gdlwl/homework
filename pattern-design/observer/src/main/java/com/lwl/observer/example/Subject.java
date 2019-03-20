package com.lwl.observer.example;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observerList = new ArrayList<Observer>();
    private int state;
    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void notifyObservers(){
        for(Observer o:observerList){
            o.update(this);
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        //状态改变自动通知观察者
        if(this.state!=state){
            System.out.println("状态由"+getState()+"变更为"+state);
            this.state = state;
            notifyObservers();
        }else{
            System.out.println("状态没有发生变化========");
        }
    }
}
