package multithreading;
class A {
    boolean flag = true;
    int itemCount = 0;

    public synchronized void producer() {
        try {
            while (true) {
                if (flag == true) {
                    itemCount = itemCount + 1;
                    System.out.println("producer produce a item : " + itemCount);
                    flag = false;
                    notify();
                } else {
                    wait();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void consumer() {

        try {
            while (true) {
                if (flag == true) {
                    wait();
                } else {
                    System.out.println("Consumer consumer the item : " + itemCount);
                    flag = true;
                    notify();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Producer extends Thread{
    A a;
    Producer(A a){
        this.a = a;
    }

    @Override
    public void run() {
        a.producer();
    }
}

class Consumer extends Thread{
    A a;

    Consumer(A a){
        this.a= a;
    }

    @Override
    public void run() {
        a.consumer();
    }
}
public class producerConsumerProblem {
    public static void main(String[] args) {
        A a = new A();
        Producer p = new Producer(a);
        Consumer c = new Consumer(a);

        p.start();
        c.start();
    }
}
