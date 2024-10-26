package multithreading;

public class TheExtendThread extends Thread {
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("The Extend value is : "+i);
            try{
                Thread.sleep(2000);
            }catch (Exception e){

            }
        }
    }
}
