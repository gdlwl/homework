package com.lwl.delegate.example;

public class Boss {
    public static void main(String[] args) {
        command("销售",new Leader());
        command("开发",new Leader());
    }

    public static  void command(String name,Leader leader){
        leader.work(name);
    }
}
