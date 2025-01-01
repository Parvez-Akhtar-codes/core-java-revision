package InnerClasses;

class A{
    class B{
        void m1(){
            System.out.println("M1b");
        }
        void m2(){
            System.out.println("M2B");
        }
        void m3(){
            System.out.println("M3B");
        }
    }
}

public class innerclass1 {
    public static void main(String[] args) {
        A.B ab = new A().new B();
        ab.m1();
        ab.m2();
        ab.m3();
    }
}
