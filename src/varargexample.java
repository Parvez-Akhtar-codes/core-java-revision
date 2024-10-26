class AB{
    void m1(int...a){
        System.out.println("number of arguement : "+a.length);
        int result=0;
        for(int i=0;i<a.length;i++){
            System.out.println("arguement list  :");
            System.out.println(a[i]+" ");
            result = result+a[i];
        }
        System.out.println("addition : "+result);
    }
}


public class varargexample {
    public static void main(String[] args) {
        AB ab = new AB();
        ab.m1(10);
        ab.m1(10,20);
        ab.m1(10,20,30);

    }
}
