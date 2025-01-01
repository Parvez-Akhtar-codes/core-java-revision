package InnerClasses;
class A3{
    interface i1{
        void im1();
        void im2();
    }
    class B3 implements i1{

        @Override
        public void im1() {
            System.out.println("IM1B");
        }

        @Override
        public void im2() {
            System.out.println("IM2B");
        }
    }
}

public class innerclass3 {
    public static void main(String[] args) {
        A3.i1 ai = new A3().new B3();
        ai.im1();
        ai.im2();

    }

}
