package InnerClasses;

class A4{
    static class B4{
        void m1(){
            System.out.println("M1B4");
        }
        void m2(){
            System.out.println("M2B4");
        }
        static void m3(){
            System.out.println("M3B3");
        }
    }
}

public class innerclass4 {
    public static void main(String[] args) {
        A4.B4 ab = new A4.B4();
        ab.m1();
        ab.m2();
        A4.B4.m3();
    }
}
