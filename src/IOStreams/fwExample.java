package IOStreams;

import java.io.FileWriter;

public class fwExample {
    public static void main(String[] args) throws Exception{
        System.out.println("Task Start.....");
        FileWriter fw = new FileWriter("D:\\xyz.txt", true);
        String str = "Junaid here";
        char[] ch = str.toCharArray();
        fw.write(ch);
        fw.close();
        System.out.println("Task Finished...");
    }
}
