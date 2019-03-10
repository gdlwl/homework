import com.lwl.hungry.SerializableSingleton;

import java.io.*;

public class SerializableSingletonClassTest {
    public static void main(String[] args) {
        SerializableSingleton s1 = SerializableSingleton.getInstance();
        SerializableSingleton s2 = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s2 = (SerializableSingleton) ois.readObject();
            ois.close();

            System.out.println(s1==s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
