package multithreading;

public class Mythread implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("the value is : "+i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
        Mythread t1 = new Mythread();

        Thread thr = new Thread(t1);
        thr.start();

        TheExtendThread et = new TheExtendThread();
        et.start();
    }
}
