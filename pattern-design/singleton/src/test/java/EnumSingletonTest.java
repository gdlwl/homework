import com.lwl.register.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class EnumSingletonTest {

    public static void main(String[] args) {
        try {
            test1();
            //test2();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static  void  test1(){
        EnumSingleton s1 = EnumSingleton.getInstance();
        EnumSingleton s2 = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s2 = (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println(s1==s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static  void test2(){
        try {
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
            EnumSingleton enumSingleton = (EnumSingleton)c.newInstance("LWL",666);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
