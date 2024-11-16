public class mathQuestions {
    public static void main(String[] args) {
        //System.out.println(palindrome(123));
       // prime(12);
        System.out.println( reverse(12233));
    }

    public static boolean palindrome(int n) {
        int dup = n;
        int revnum = 0;
        while (dup != 0) {
            int rem = dup % 10;
            revnum = (revnum * 10) + rem;
            dup = dup / 10;
        }

        if (revnum == n) {
            return true;
        } else {
            return false;
        }
    }

public static void prime(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
              count++;
            }
        }
        if(count==2){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
}

public static int reverse(int n){
        int dup=n;
        int revnum=0;
        while (dup!=0){
            int rem = dup%10;
            revnum = (revnum*10)+rem;
            dup = dup/10;
        }
        return revnum;

}

}
