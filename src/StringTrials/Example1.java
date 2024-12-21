package StringTrials;

public class Example1 {
    public static void main(String[] args) {
        String myname1 = "junaid";
        String myname2 = "junaid";
        String myname3 = new String("junaid");
        String myname4 = new String("junaid");

        if(myname1 == myname2){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if(myname1.equals(myname2)){
            System.out.println("true");

        }else {
            System.out.println("false");
        }

        if(myname1 == myname3){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        if(myname1.equals(myname3)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
