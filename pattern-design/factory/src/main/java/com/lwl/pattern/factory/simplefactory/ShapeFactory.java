package com.lwl.pattern.factory.simplefactory;

import com.lwl.pattern.factory.Circle;
import com.lwl.pattern.factory.IShape;
import com.lwl.pattern.factory.Rectangle;
import com.lwl.pattern.factory.Square;

public class ShapeFactory {
    public static IShape createShape(String shapeName){
        if(shapeName==null||shapeName.trim()==""){
            System.out.println("参数为空！");
            return null;
        }else if(shapeName.equalsIgnoreCase("square")){
            return new Square();
        }else if(shapeName.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else if(shapeName.equalsIgnoreCase("circle")){
            return new Circle();
        }else{
            System.out.println("该形状还未纳入ShapeFactory管理！");
            return null;
        }
    }

    public static <T> T createShape(Class<T> tClass){
        T t = null;
        if(tClass==null){
            System.out.println("参数为空！");
            return t;
        }
        try {
            t=tClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return t;
    }
}
