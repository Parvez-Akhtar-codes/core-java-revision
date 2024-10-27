package multithreading;
class th1 extends Thread{
    @Override
    public void run() {
        for(int i =0;i<=5;i++){
            System.out.println("user thread");
        }
    }
}
public class threadExampleByThreadClass {
    public static void main(String[] args) {

        th1 th1 = new th1();
        th1.start();
        for(int i=0;i<=5;i++) {
            System.out.println("main thread");
        }
    }
}
