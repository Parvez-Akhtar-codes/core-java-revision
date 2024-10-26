package Inputstreamcode;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class fileinput {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            fis = new FileInputStream("D:\\javatuts\\source.txt");
            fos = new FileOutputStream("D:\\javatuts\\dest.txt");

            int content;
            while((content = (fis.read()))!= -1){
                fos.write((byte) content);

            }

        }catch (Exception e){

        }
        finally {
            if(fis!=null){
                fis.close();
            }
        }

    }
}
