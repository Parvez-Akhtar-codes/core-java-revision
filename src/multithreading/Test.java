package multithreading;


class GarbageCollector extends Thread{
    public void run() {
        while(true) {
            System.out.println("Garbage Collector Thread");
        }
    }
}
public class Test {
    public static void main(String[] args){
        GarbageCollector gc = new GarbageCollector();
        gc.setDaemon(true);
        gc.start();

        for(int i = 0; i < 10; i++) {
            System.out.println("JVM Thread");
        }
        System.out.println(gc.isDaemon());
    }
}