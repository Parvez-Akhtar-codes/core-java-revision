package multithreading;
class syncmethod{
    public synchronized void m1(){
        for(int i=0;i<=5;i++){
            System.out.println("Synchronized method");
        }
    }
}

class Mythread1 extends Thread{
    syncmethod syncmethod;
    Mythread1(syncmethod syncmethod){
        this.syncmethod = syncmethod;
    }

    @Override
    public void run() {
        syncmethod.m1();
    }
}
class Mythread2 extends Thread{
    syncmethod syncmethod;
    Mythread2(syncmethod syncmethod){
        this.syncmethod = syncmethod;
    }

    @Override
    public void run() {
        syncmethod.m1();
    }
}
class Mythread3 extends Thread{
    syncmethod syncmethod;
    Mythread3(syncmethod syncmethod){
        this.syncmethod = syncmethod;
    }

    @Override
    public void run() {
        syncmethod.m1();
    }
}

public class SynchronizedMethod {
    public static void main(String[] args) {
        syncmethod sm = new syncmethod();
        Mythread1 mt1 = new Mythread1(sm);
        Mythread2 mt2 = new Mythread2(sm);
        Mythread3 mt3 = new Mythread3(sm);

        mt1.setName("AAA");
        mt2.setName("BBB");
        mt3.setName("CCC");

        mt1.start();
        mt2.start();
        mt3.start();

    }
}
