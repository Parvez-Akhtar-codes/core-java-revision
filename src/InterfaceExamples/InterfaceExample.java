package InterfaceExamples;

interface shape{
    double getArea(double pi , int radius);

}
class circle implements shape{

    @Override
    public double getArea(double pi , int radius) {
        return  (pi*radius);
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        double pi = 3.14;
        circle circle = new circle();
        double result  = circle.getArea(pi , 7);
        System.out.println(result);

    }
}
