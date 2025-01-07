package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class imageExample {
    public static void main(String[] args) throws Exception {
        System.out.println("Task Starting.....");
        FileInputStream fis  = new FileInputStream("D:\\javatuts\\dest.jpg");
        int size = fis.available();
        byte[] b = new byte[size];
        fis.read(b);
        //String str = new String(b);
        System.out.println("Image successfully read");
        FileOutputStream fos = new FileOutputStream("D:\\WT\\abc.jpg");
        fos.write(b);
        System.out.println("Image Successfully written");
        fos.close();
        fis.close();
    }
}
