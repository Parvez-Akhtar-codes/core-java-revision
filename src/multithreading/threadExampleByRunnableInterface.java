package multithreading;
class th2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println("user thread");
        }
    }
}

public class threadExampleByRunnableInterface {
    public static void main(String[] args) {
        th2 th2 = new th2();
        Thread thr = new Thread(th2);
        thr.start();
        for(int i=0;i<=5;i++){
            System.out.println("main thread");
        }
    }
}
