abstract  class A{
    abstract void m1();
    abstract void m2();

}

class b extends A{
    @Override
    void m1() {
        System.out.println("m1");
    }

    void m2(){
        System.out.println("m2");
    }
}
public class abstractclassexample {

    public static void main(String[] args) {
     A a = new b();
     a.m1();
     a.m2();
    }


}
