package InnerClasses;
interface i2{
    class A4{
        void im1(){
            System.out.println("IM1");
        }
        void im2(){
            System.out.println("IM2");
        }
    }
}

public class innerclass5 {
    public static void main(String[] args) {


        i2.A4 i2a = new i2.A4();
        i2a.im1();
        i2a.im2();
    }
}
