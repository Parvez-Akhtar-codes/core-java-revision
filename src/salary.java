public class salary extends Employee {

    @Override
    public void greet() {
        System.out.println("Hello world");
    }
}


class main1{
    public static void main(String[] args) {
      salary salary = new salary();
        salary.greet();
    }
    
}
