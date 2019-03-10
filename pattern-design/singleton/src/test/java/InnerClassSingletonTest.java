import com.lwl.innerclass.InnerClassSingleton;

import java.lang.reflect.Constructor;

public class InnerClassSingletonTest {

    //测试反射破坏单例
    public static void main(String[] args) {
        test1();
        test1();
    }
    public static  void test1(){
        Object obj= InnerClassSingleton.getInstance();
        System.out.println(obj);
    }
    public static  void test2(){
        Class<?> clazz = InnerClassSingleton.class;
        try {
            Constructor constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            Object o1 = constructor.newInstance();
            Object o2 = constructor.newInstance();
            System.out.println(o1==o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
