class methodsonly{
    public int m1(){
        System.out.println("m1");
        return 2334;
    }
}




public class sample {
    public static void main(String[] args) {
        methodsonly mo = new methodsonly();
        if(mo.m1()==2334){
            System.out.println("true");

        }
    }
}