package com.lwl.proxy.example;

public class ProxySubject implements  Subject {
    private  static Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    private void preRequest(){
        System.out.println("doSmoething berfore request ");
    }
    private void postRequest(){
        System.out.println("doSomething after request");
    }
    public void request() {
        preRequest();
        subject.request();
        postRequest();
    }
}
