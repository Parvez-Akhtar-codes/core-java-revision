package IOStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FisExample {
    public static void main(String[] args) throws IOException {
        System.out.println("Task Starting.......");
        FileInputStream fis = new FileInputStream("D:\\javatuts\\abc.txt");
        int size = fis.available();
        byte[] b = new byte[size];
        fis.read(b);
        String str = new String(b);
        System.out.println(str);
        System.out.println("Task Executed Successfully");

    }
}
