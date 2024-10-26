package Exception_handling;

public class trycatchblock {

    public static void main(String[] args) throws RuntimeException {
        System.out.println("before try block");
        try{
            System.out.println("inside try block before Exception");
            int i = 100/0;
            System.out.println("inside try block after Exception");
            System.out.println(i);
        }catch (Exception e){
            System.out.println("in catch block");
            e.printStackTrace();
            System.out.println(e.getMessage());

        }finally {
            System.out.println("in finally block");

        }
        try {
            throw new RuntimeException();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
