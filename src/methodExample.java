class employee{
    private String ename;
    private String eadd;
    private String edep;
    private int esal;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEadd() {
        return eadd;
    }

    public void setEadd(String eadd) {
        this.eadd = eadd;
    }

    public String getEdep() {
        return edep;
    }

    public void setEdep(String edep) {
        this.edep = edep;
    }

    public int getEsal() {
        return esal;
    }

    public void setEsal(int esal) {
        this.esal = esal;
    }
}



public class methodExample {
    public static void main(String[] args) {
        employee emp = new employee();
        emp.setEname("junaid");
        emp.setEadd("jaipur");
        emp.setEdep("java");
        emp.setEsal(20000);
        System.out.println("Employee details : ");
        System.out.println("Employee name : "+emp.getEname());
        System.out.println("Employee address : "+emp.getEadd());

    }
}
