package IOStreams;

import java.io.FileInputStream;
import java.util.StringTokenizer;

public class FisExample2 {
    public static void main(String[] args) throws  Exception{
        FileInputStream fis = new FileInputStream("D:\\javatuts\\abc.txt");
        int size = fis.available();
        byte[] b = new byte[size];
        fis.read(b);
        String str = new String(b);
        System.out.println(str);
        fis.close();
        StringTokenizer stkn = new StringTokenizer(str);
        int stknsize = stkn.countTokens();
        System.out.println("Words size : "+stknsize);
        int count =0;
        while(stkn.hasMoreTokens()){
            String token = stkn.nextToken();
            System.out.println(token);
            if(token.equals("Junaid")){
                count++;
            }
        }
        System.out.println("Junaid word count : "+count);
        fis.close();
    }
}
