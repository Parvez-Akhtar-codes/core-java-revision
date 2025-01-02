package oops;
class A{
    void add(int ... a){
        int result = 0;
        for(int i=0;i<a.length;i++){
            result = result +a[i];

        }
        System.out.println(result);
    }
}
public class VarArg {
    public static void main(String[] args) {
        A a = new A();
        a.add(10,20);
        a.add(10,20,30,40);
    }
}
