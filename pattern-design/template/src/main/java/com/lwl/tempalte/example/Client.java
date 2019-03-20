package com.lwl.tempalte.example;

public class Client {
    public static void main(String[] args) {
         AbstractClass abstractClass = new ConcreteClassA();
         abstractClass.templateMethod();
    }
}
