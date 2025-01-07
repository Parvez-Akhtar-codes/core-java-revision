package IOStreams;

import java.io.FileReader;

public class FrExample {
    public static void main(String[] args) throws Exception{
        System.out.println("Task Start....");
        FileReader fr = new FileReader("D:\\xyz.txt");
        String str = "";
        int size = fr.read();
        System.out.println(size);
        while(size != -1){
            str  = str + (char)size;
          //  System.out.println(size);
            size = fr.read();
        }
        System.out.println(str);
        fr.close();
        System.out.println("Task Finished....");
    }
}
