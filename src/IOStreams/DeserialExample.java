package IOStreams;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserialExample {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("D:\\serial.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee1 emp2 = (Employee1)ois.readObject();
        System.out.println("After deserialize");
        emp2.empdatails();
        System.out.println("Task done");
    }
}
