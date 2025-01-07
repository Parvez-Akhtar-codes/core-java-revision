package IOStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FosExample {
    public static void main(String[] args) throws IOException {
        System.out.println("Task Starting.....");
        FileOutputStream fos = new FileOutputStream("D:\\javatuts\\abc.txt");
        String sb = "hello";
        byte[] b = sb.getBytes();
        fos.write(b);
        fos.close();
        System.out.println("Task Excuted Successfully");
    }
}
