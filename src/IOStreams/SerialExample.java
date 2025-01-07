package IOStreams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee1 implements Serializable{
    int empid;
    String empname;
    int empsalary;
    String empadd;

    public Employee1(int empid , String empname , int empsalary , String empadd){
        this.empid = empid;
        this.empname = empname;
        this.empsalary = empsalary;
        this.empadd = empadd;
    }

    void empdatails(){
        System.out.println("here's the employee details : ");
        System.out.println("--------------------------------");
        System.out.println("Employee id : "+empid);
        System.out.println("Employee name : "+empname);
        System.out.println("Employee salary : "+empsalary);
        System.out.println("Employee add : "+empadd);
    }
}

public class SerialExample {
    public static void main(String[] args) throws  Exception{
        Employee1 emp = new Employee1(12 , "junaid",20000,"jaipur");
        FileOutputStream fos = new FileOutputStream("D://serial.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        System.out.println("Object before serialize");
        emp.empdatails();
        oos.writeObject(emp);
        oos.close();
        fos.close();
        System.out.println();
        System.out.println("Task Finished");
    }
}
