package oops;

public class bitwise {
    static boolean m1(){
        System.out.println("M1");
        return true;
    }
    static boolean m2(){
        System.out.println("M2");
         return false;
    }

    public static void main(String[] args) {
        if(m1() || m2()){
            System.out.println("M1 || M2");
        }
        if(m1() && m2()){
            System.out.println("M1 && M2");
        }
        if(m1() && m1()){
            System.out.println("M1 && M1 ");
        }
        if(m2() || m2()){
            System.out.println("M2 && M2");
        }
    }
}
