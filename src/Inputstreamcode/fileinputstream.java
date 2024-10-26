package Inputstreamcode;

import java.io.FileInputStream;

public class fileinputstream {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("D:\\javatuts\\source.txt");
        int size  = fis.available();
        byte[] b = new byte[size];
        fis.read(b);
        String data  = new String(b);
        System.out.println(data);


    }
}
