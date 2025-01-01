package InnerClasses;

class A2{
    class B{
        void m1(){
            System.out.println("M1B");
        }
        void m2(){
            System.out.println("M2B");
        }
    }
    class C extends B{
        void m3(){
            System.out.println("m3c");
        }
        void m4(){
            System.out.println("m4c");
        }
    }
}

public class InnerClass2 {
    public static void main(String[] args) {
        A2.C ac = new A2().new C();
        ac.m1();
        ac.m2();
        ac.m3();
        ac.m4();

    }
}
