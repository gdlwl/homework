package com.lwl.delegate.example;

import java.util.HashMap;
import java.util.Map;

public class Leader implements  IEmployee{
    private static Map<String,IEmployee> targets = new HashMap<String, IEmployee>();
    public Leader() {
        targets.put("销售",new Salesperson());
        targets.put("开发",new Technologist());
    }

    @Override
    public void work(String workName) {
        targets.get(workName).work(workName);
    }
}
